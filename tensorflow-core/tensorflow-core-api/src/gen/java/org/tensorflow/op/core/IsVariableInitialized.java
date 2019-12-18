/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.core;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TBool;
import org.tensorflow.types.family.TType;

/**
 * Checks whether a tensor has been initialized.
 * <p>
 * Outputs boolean scalar indicating whether the tensor has been initialized.
 */
@Operator
public final class IsVariableInitialized extends PrimitiveOp implements Operand<TBool> {
  
  /**
   * Factory method to create a class wrapping a new IsVariableInitialized operation.
   * 
   * @param scope current scope
   * @param ref Should be from a `Variable` node. May be uninitialized.
   * @return a new instance of IsVariableInitialized
   */
  public static <T extends TType> IsVariableInitialized create(Scope scope, Operand<T> ref) {
    OperationBuilder opBuilder = scope.env().opBuilder("IsVariableInitialized", scope.makeOpName("IsVariableInitialized"));
    opBuilder.addInput(ref.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new IsVariableInitialized(opBuilder.build());
  }
  
  /**
   */
  public Output<TBool> isInitialized() {
    return isInitialized;
  }
  
  @Override
  public Output<TBool> asOutput() {
    return isInitialized;
  }
  
  private Output<TBool> isInitialized;
  
  private IsVariableInitialized(Operation operation) {
    super(operation);
    int outputIdx = 0;
    isInitialized = operation.output(outputIdx++);
  }
}
