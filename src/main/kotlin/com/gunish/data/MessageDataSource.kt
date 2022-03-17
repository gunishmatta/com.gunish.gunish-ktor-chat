package com.gunish.data

import com.gunish.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages():List<Message>

    suspend fun insertMessage(message: Message)

}