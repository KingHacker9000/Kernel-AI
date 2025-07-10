package com.myco.kernel

import android.content.Intent
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ContextKernelServiceTest {
  private lateinit var service: ContextKernelService

  @Before fun setup() {
    service = ContextKernelService()
  }

  @Test fun bindReturnsNonNullBinder() {
    val binder = service.onBind(Intent("com.myco.KERNEL"))
    assertNotNull("Binder should not be null", binder)
    assertTrue("Binder must implement IContextKernel", binder is IContextKernel)
  }
}
