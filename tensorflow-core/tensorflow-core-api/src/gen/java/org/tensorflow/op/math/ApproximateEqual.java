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

package org.tensorflow.op.math;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TBool;
import org.tensorflow.types.family.TType;

/**
 * Returns the truth value of abs(x-y) < tolerance element-wise.
 */
@Operator(group = "math")
public final class ApproximateEqual extends RawOp implements Operand<TBool> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.math.ApproximateEqual}
   */
  public static class Options {
    
    /**
     * @param tolerance 
     */
    public Options tolerance(Float tolerance) {
      this.tolerance = tolerance;
      return this;
    }
    
    private Float tolerance;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new ApproximateEqual operation.
   * 
   * @param scope current scope
   * @param x 
   * @param y 
   * @param options carries optional attributes values
   * @return a new instance of ApproximateEqual
   */
  @Endpoint(describeByClass = true)
  public static <T extends TType> ApproximateEqual create(Scope scope, Operand<T> x, Operand<T> y, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("ApproximateEqual", scope.makeOpName("ApproximateEqual"));
    opBuilder.addInput(x.asOutput());
    opBuilder.addInput(y.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.tolerance != null) {
          opBuilder.setAttr("tolerance", opts.tolerance);
        }
      }
    }
    return new ApproximateEqual(opBuilder.build());
  }
  
  /**
   * @param tolerance 
   */
  public static Options tolerance(Float tolerance) {
    return new Options().tolerance(tolerance);
  }
  
  /**
   */
  public Output<TBool> z() {
    return z;
  }
  
  @Override
  public Output<TBool> asOutput() {
    return z;
  }
  
  /** The name of this op, as known by TensorFlow core engine */
  public static final String OP_NAME = "ApproximateEqual";
  
  private Output<TBool> z;
  
  private ApproximateEqual(Operation operation) {
    super(operation);
    int outputIdx = 0;
    z = operation.output(outputIdx++);
  }
}
