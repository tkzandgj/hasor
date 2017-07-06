/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.data.ql.domain;
import net.hasor.data.ql.domain.inst.InstCompilerStack;
import net.hasor.data.ql.domain.inst.InstQueue;

import java.util.ArrayList;
import java.util.List;
/**
 * 列表
 * @author 赵永春(zyc@hasor.net)
 * @version : 2017-03-23
 */
public class ListExpression extends Expression {
    private Class<?>         listType;
    private List<Expression> expressionList;
    public ListExpression() {
        this.listType = ArrayList.class;
        this.expressionList = new ArrayList<Expression>();
    }
    //
    //
    /** 添加元素 */
    public void addItem(Expression valueExp) {
        if (valueExp != null) {
            this.expressionList.add(valueExp);
        }
    }
    //
    //
    @Override
    public void doCompiler(InstQueue queue, InstCompilerStack stackTree) {
        queue.inst(NA, this.listType);
        for (Expression exp : this.expressionList) {
            exp.doCompiler(queue, stackTree);
            queue.inst(PUSH);
        }
    }
}