package com.pattern.behavior.pinterpreter.abstracts;

import com.pattern.behavior.pinterpreter.interfaces.Node;

/**
 * Created by timaimee on 2017/6/19.
 */
public class DivNode extends SymbolNode {

    public DivNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
