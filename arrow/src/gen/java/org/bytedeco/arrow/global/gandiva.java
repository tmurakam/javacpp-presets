// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow.global;

import org.bytedeco.gandiva.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

public class gandiva extends org.bytedeco.arrow.presets.gandiva {
    static { Loader.load(); }

// Targeting ../../gandiva/FunctionSignatureVector.java


// Targeting ../../gandiva/IntSet.java


// Targeting ../../gandiva/LongSet.java


// Targeting ../../gandiva/StringSet.java


// Parsed from gandiva/visibility.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #if defined(_WIN32) || defined(__CYGWIN__)
// #if defined(_MSC_VER)
// #pragma warning(push)
// #pragma warning(disable : 4251)
// #else
// #pragma GCC diagnostic ignored "-Wattributes"
// #endif

// #ifdef GANDIVA_STATIC
// #define GANDIVA_EXPORT
// #elif defined(GANDIVA_EXPORTING)
// #define GANDIVA_EXPORT __declspec(dllexport)
// #else
// #define GANDIVA_EXPORT __declspec(dllimport)
// #endif

// #define GANDIVA_NO_EXPORT
// #else  // Not Windows
// #ifndef GANDIVA_EXPORT
// #define GANDIVA_EXPORT __attribute__((visibility("default")))
// #endif
// #ifndef GANDIVA_NO_EXPORT
// #define GANDIVA_NO_EXPORT __attribute__((visibility("hidden")))
// #endif
// #endif  // Non-Windows

// #if defined(_MSC_VER)
// #pragma warning(pop)
// #endif


// Parsed from gandiva/configuration.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>

// #include "arrow/status.h"

// #include "gandiva/visibility.h"
// Targeting ../../gandiva/Configuration.java


// Targeting ../../gandiva/ConfigurationBuilder.java



  // namespace gandiva


// Parsed from gandiva/arrow.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_EXPR_ARROW_H
// #define GANDIVA_EXPR_ARROW_H

// #include <memory>
// #include <vector>

// #include <arrow/array.h>
// #include <arrow/builder.h>
// #include <arrow/pretty_print.h>
// #include <arrow/record_batch.h>
// #include <arrow/status.h>
// #include <arrow/type.h>

@Namespace("gandiva") public static native @Cast("bool") boolean is_decimal_128(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  // namespace gandiva

// #endif  // GANDIVA_EXPR_ARROW_H


// Parsed from gandiva/logging.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_LOGGING_H
// #define GANDIVA_LOGGING_H

// TODO : setup logging or use glog.
// #include <arrow/util/logging.h>

// #endif  // GANDIVA_LOGGING_H


// Parsed from gandiva/function_signature.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_FUNCTION_SIGNATURE_H
// #define GANDIVA_FUNCTION_SIGNATURE_H

// #include <sstream>
// #include <string>
// #include <vector>

// #include "gandiva/arrow.h"
// #include "gandiva/logging.h"
// #include "gandiva/visibility.h"
// Targeting ../../gandiva/FunctionSignature.java



  // namespace gandiva

// #endif  // GANDIVA_FUNCTION_SIGNATURE_H


// Parsed from gandiva/gandiva_aliases.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_ALIASES_H
// #define GANDIVA_ALIASES_H

// #include <memory>
// #include <string>
// #include <unordered_set>
// #include <vector>
// Targeting ../../gandiva/Dex.java


// Targeting ../../gandiva/ValueValidityPair.java


// Targeting ../../gandiva/FieldDescriptor.java


// Targeting ../../gandiva/FuncDescriptor.java


// Targeting ../../gandiva/LValue.java


// Targeting ../../gandiva/Node.java


// Targeting ../../gandiva/EvalBatch.java



  // namespace gandiva

// #endif  // GANDIVA_ALIASES_H


// Parsed from gandiva/expression.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_EXPR_EXPRESSION_H
// #define GANDIVA_EXPR_EXPRESSION_H

// #include <string>

// #include "gandiva/arrow.h"
// #include "gandiva/gandiva_aliases.h"
// #include "gandiva/visibility.h"
// Targeting ../../gandiva/Expression.java



  // namespace gandiva

// #endif  // GANDIVA_EXPR_EXPRESSION_H


// Parsed from gandiva/expression_registry.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_TYPES_H
// #define GANDIVA_TYPES_H

// #include <memory>
// #include <vector>

// #include "gandiva/arrow.h"
// #include "gandiva/function_signature.h"
// #include "gandiva/gandiva_aliases.h"
// #include "gandiva/visibility.h"
// Targeting ../../gandiva/NativeFunction.java


// Targeting ../../gandiva/FunctionRegistry.java


// Targeting ../../gandiva/ExpressionRegistry.java



@Namespace("gandiva") public static native @ByVal FunctionSignatureVector GetRegisteredFunctionSignatures();

  // namespace gandiva
// #endif  // GANDIVA_TYPES_H


// Parsed from gandiva/condition.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_CONDITION_H
// #define GANDIVA_CONDITION_H

// #include <memory>

// #include "gandiva/arrow.h"
// #include "gandiva/expression.h"
// #include "gandiva/gandiva_aliases.h"
// Targeting ../../gandiva/Condition.java



  // namespace gandiva

// #endif  // GANDIVA_CONDITION_H


// Parsed from gandiva/selection_vector.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_SELECTION_VECTOR__H
// #define GANDIVA_SELECTION_VECTOR__H

// #include <memory>

// #include "arrow/status.h"

// #include "gandiva/arrow.h"
// #include "gandiva/logging.h"
// #include "gandiva/visibility.h"
// Targeting ../../gandiva/SelectionVector.java



  // namespace gandiva

// #endif  // GANDIVA_SELECTION_VECTOR__H


// Parsed from gandiva/filter.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/status.h"

// #include "gandiva/arrow.h"
// #include "gandiva/condition.h"
// #include "gandiva/configuration.h"
// #include "gandiva/selection_vector.h"
// #include "gandiva/visibility.h"
// Targeting ../../gandiva/LLVMGenerator.java


// Targeting ../../gandiva/Filter.java



  // namespace gandiva


// Parsed from gandiva/projector.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/status.h"

// #include "gandiva/arrow.h"
// #include "gandiva/configuration.h"
// #include "gandiva/expression.h"
// #include "gandiva/selection_vector.h"
// #include "gandiva/visibility.h"
// Targeting ../../gandiva/Projector.java



  // namespace gandiva


// Parsed from gandiva/basic_decimal_scalar.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <cstdint>
// #include "arrow/util/basic_decimal.h"
// Targeting ../../gandiva/BasicDecimalScalar128.java



@Namespace("gandiva") public static native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef BasicDecimalScalar128 left,
                       @Const @ByRef BasicDecimalScalar128 right);

@Namespace("gandiva") public static native @ByVal @Name("operator -") BasicDecimalScalar128 subtract(@Const @ByRef BasicDecimalScalar128 operand);

  // namespace gandiva


// Parsed from gandiva/decimal_scalar.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License

// #pragma once

// #include <cstdint>
// #include <string>
// #include "arrow/util/decimal.h"
// #include "gandiva/basic_decimal_scalar.h"


///
// Targeting ../../gandiva/DecimalScalar128.java



  // namespace gandiva


// Parsed from gandiva/tree_expr_builder.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef GANDIVA_EXPR_TREE_BUILDER_H
// #define GANDIVA_EXPR_TREE_BUILDER_H

// #include <memory>
// #include <string>
// #include <unordered_set>
// #include <vector>

// #include "arrow/type.h"
// #include "gandiva/condition.h"
// #include "gandiva/decimal_scalar.h"
// #include "gandiva/expression.h"
// #include "gandiva/visibility.h"
// Targeting ../../gandiva/TreeExprBuilder.java



  // namespace gandiva

// #endif  // GANDIVA_EXPR_TREE_BUILDER_H


}
