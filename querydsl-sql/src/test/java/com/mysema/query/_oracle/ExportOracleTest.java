/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.query._oracle;

import org.junit.BeforeClass;
import org.junit.Ignore;

import com.mysema.query.Connections;
import com.mysema.query.ExportBaseTest;
import com.mysema.testutil.ResourceCheck;

@ResourceCheck("/oracle.run")
public class ExportOracleTest extends ExportBaseTest{

    @BeforeClass
    public static void setUpClass() throws Exception {
        Connections.initOracle();
    }

}
