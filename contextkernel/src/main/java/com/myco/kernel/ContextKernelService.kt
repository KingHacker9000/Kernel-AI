package com.myco.kernel

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.Bundle
import com.myco.kernel.IContextKernel

class ContextKernelService : Service() {
    private val binder = object : IContextKernel.Stub() {
        override fun ask(prompt: String, appId: String, scopes: Bundle): String {
            TODO("Implement LLM inference")
        }
        override fun putSecret(label: String, data: ByteArray): ByteArray {
            TODO("Implement secure vault write")
        }
        override fun getSecret(label: String): ByteArray {
            TODO("Implement secure vault read")
        }
        override fun addVector(ns: String, embedding: FloatArray, jsonMeta: String) {
            TODO("Implement vector store add")
        }
        override fun search(ns: String, query: FloatArray, k: Int): MutableList<VectorHit> {
            TODO("Implement vector store search")
        }
        override fun fireIntent(action: String, extras: Bundle) {
            TODO("Implement structured or fallback automation")
        }
    }

    override fun onBind(intent: Intent): IBinder = binder
}
