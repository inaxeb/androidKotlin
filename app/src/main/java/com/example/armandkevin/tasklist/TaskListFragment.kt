package com.example.armandkevin.tasklist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.armandkevin.R


class TaskListFragment : Fragment () {
    private var taskList = listOf("Task 1", "Task 2", "Task 3")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_task_list, container, false)
        return rootView;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.id_de_votre_recycler_view)
        recyclerView.layoutManager = ...
    }
    val adapter = TaskListAdapter() // ne marche pas pour l'instant
    adapter.currentList = taskList
}