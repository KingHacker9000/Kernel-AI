package com.myco.kernel;

import android.os.Bundle;
import java.util.List;

/**
 * Interface for Context Kernel interactions.
 */
interface IContextKernel {
    /**
     * Ask the kernel to process a prompt.
     * @param prompt  User or system prompt
     * @param appId   Caller package name
     * @param scopes  Bundle with granted capability tokens
     * @return        Response text
     */
    String ask(in String prompt, in String appId, in Bundle scopes);

    /**
     * Store and retrieve opaque secrets.
     */
    byte[] putSecret(in String label, in byte[] data);
    byte[] getSecret(in String label);

    /**
     * Vector store operations.
     */
    void   addVector(in String ns, in float[] embedding, in String jsonMeta);
    List<VectorHit> search(in String ns, in float[] query, int k);

    /**
     * Request the kernel to fire an Intent or accessibility action.
     */
    void fireIntent(in String action, in Bundle extras);
}

parcelable VectorHit cpp_header "com/myco/kernel/VectorHit.h";
