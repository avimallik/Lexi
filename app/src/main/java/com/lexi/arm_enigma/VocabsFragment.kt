package com.lexi.arm_enigma

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.lexi.arm_enigma.adapter.VocabListAdapter
import com.lexi.arm_enigma.model.VocabModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_vocab_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vocabListRecyclerView:RecyclerView = view.findViewById(R.id.vocab_list)

        vocabListRecyclerView.layoutManager = LinearLayoutManager(activity)

        val vocabData = ArrayList<VocabModel>()
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))
        vocabData.add(VocabModel("Pen","An object for writing"))

        val adapter = VocabListAdapter(vocabData)
        vocabListRecyclerView.adapter = adapter

        view.findViewById<FloatingActionButton>(R.id.add_vocab).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

}