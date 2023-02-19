package com.example.guests.constants

class DataBaseConstants private constructor() {
    object GUEST {
        const val TABLE_NAME = "Guest"

        object COLUMN {
            const val ID = "id"
            const val NAME = "name"
            const val PRESENCE = "presence"
        }
    }
}