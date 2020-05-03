package io.cucumber.scala

import scala.collection.mutable.ArrayBuffer

class ScalaDslRegistry {

  val stepDefinitions = new ArrayBuffer[ScalaStepDetails]

  val beforeHooks = new ArrayBuffer[ScalaHookDetails]

  val beforeStepHooks = new ArrayBuffer[ScalaHookDetails]

  val afterHooks = new ArrayBuffer[ScalaHookDetails]

  val afterStepHooks = new ArrayBuffer[ScalaHookDetails]

  val docStringTypes = new ArrayBuffer[ScalaDocStringTypeDetails[_]]

  val dataTableTypes = new ArrayBuffer[ScalaDataTableTypeDetails[_]]

  val parameterTypes = new ArrayBuffer[ScalaParameterTypeDetails[_]]

  val defaultParameterTransformers = new ArrayBuffer[ScalaDefaultParameterTransformerDetails]

  val defaultDataTableCellTransformers = new ArrayBuffer[ScalaDefaultDataTableCellTransformerDetails]

  val defaultDataTableEntryTransformers = new ArrayBuffer[ScalaDefaultDataTableEntryTransformerDetails]

}

