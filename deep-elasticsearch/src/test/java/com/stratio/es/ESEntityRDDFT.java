/*
 * Copyright 2014, Stratio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.es;

import java.io.Serializable;

import org.testng.annotations.Test;

import com.stratio.deep.core.extractor.ExtractorEntityTest;
import com.stratio.deep.es.extractor.ESEntityExtractor;

/**
 * Created by rcrespo on 29/08/14.
 */
@Test(suiteName = "ESRddTests", groups = { "ESEntityRDDTest", "FunctionalTests" }, dependsOnGroups = "ESCellRDDTest")
public class ESEntityRDDFT extends ExtractorEntityTest implements Serializable {

    public ESEntityRDDFT() {

        super(ESEntityExtractor.class, "localhost", 9200, false);
    }

}