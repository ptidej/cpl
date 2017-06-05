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
 * f0 -> "extends"
 * f1 -> ClassOrInterfaceType()
 * f2 -> ( "&" ClassOrInterfaceType() )*
 */
public class TypeBound implements Node {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public NodeToken f0;
   public ClassOrInterfaceType f1;
   public NodeListOptional f2;

   public TypeBound(NodeToken n0, ClassOrInterfaceType n1, NodeListOptional n2) {
      this.f0 = n0;
      this.f1 = n1;
      this.f2 = n2;
   }

   public TypeBound(ClassOrInterfaceType n0, NodeListOptional n1) {
      this.f0 = new NodeToken("extends");
      this.f1 = n0;
      this.f2 = n1;
   }

   public void accept(util.parser.java.v15.visitors.Visitor v) {
      v.visit(this);
   }
   public Object accept(util.parser.java.v15.visitors.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

