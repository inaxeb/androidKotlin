package com.example.armandkevin.tasklist

data class Task (val id : String, val title : String, val description : String = "ma description")
    :java.io.Serializable