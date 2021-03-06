/*
 * Copyright 1997-2017 Optimatika
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.ojalgo.function;

import static org.ojalgo.function.ComplexFunction.*;
import static org.ojalgo.scalar.ComplexNumber.*;

import org.ojalgo.TestUtils;

/**
 * Tests that {@linkplain org.ojalgo.function.ComplexFunction} functions work correctly with complex valued
 * arguments and results (complex part is not zero).
 *
 * @author apete
 */
public class ComplexCase extends FunctionTests {

    public ComplexCase() {
        super();
    }

    public ComplexCase(final String name) {
        super(name);
    }

    public void testDIVIDE() {
        TestUtils.assertEquals(ONE, DIVIDE.invoke(I, I));
    }

    public void testMULTIPLY() {
        TestUtils.assertEquals(NEG, MULTIPLY.invoke(I, I));
    }

    public void testPOWER() {
        TestUtils.assertEquals(NEG, POWER.invoke(I, 2));
    }

    public void testROOT() {
        TestUtils.assertEquals(I, ROOT.invoke(NEG, 2));
    }

    public void testSQRT() {
        TestUtils.assertEquals(I, SQRT.invoke(NEG));
    }

    public void testSUBTRACT() {
        TestUtils.assertEquals(ZERO, SUBTRACT.invoke(I, I));
    }

}
