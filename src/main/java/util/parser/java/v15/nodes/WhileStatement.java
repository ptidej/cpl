/*******************************************************************************
 * Copyright (c) 2014 Yann-Ga�l Gu�h�neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-Ga�l Gu�h�neuc and others, see in file; API and its implementation
 ******************************************************************************/
//
// Generated by JTB 1.2.2
//

package util.parser.java.v15.nodes;

/**
 * Grammar production:
 * f0 -> "while"
 * f1 -> "("
 * f2 -> Expression()
 * f3 -> ")"
 * f4 -> Statement()
 */
public class WhileStatement implements Node {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public NodeToken f0;
   public NodeToken f1;
   public Expression f2;
   public NodeToken f3;
   public Statement f4;

   public WhileStatement(NodeToken n0, NodeToken n1, Expression n2, NodeToken n3, Statement n4) {
      this.f0 = n0;
      this.f1 = n1;
      this.f2 = n2;
      this.f3 = n3;
      this.f4 = n4;
   }

   public WhileStatement(Expression n0, Statement n1) {
      this.f0 = new NodeToken("while");
      this.f1 = new NodeToken("(");
      this.f2 = n0;
      this.f3 = new NodeToken(")");
      this.f4 = n1;
   }

   public void accept(util.parser.java.v15.visitors.Visitor v) {
      v.visit(this);
   }
   public Object accept(util.parser.java.v15.visitors.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

