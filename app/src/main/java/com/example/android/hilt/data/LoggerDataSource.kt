package com.example.android.hilt.data

/**
 * Created by Simform Solutions on 15 March 2021.
 **/
interface LoggerDataSource {
    fun addLog(message: String)
    fun getAllLogs(callback:(List<Log>)->Unit)
    fun removeLogs()

}