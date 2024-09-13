package variableScopeNewOne;

import variableScopeNew.VarScope;

public class VarScopeThree extends VarScope{
public static void main(String[] args) {
VarScope vs=new VarScope();

System.out.println(vs.publicVariable);
 

vs.verifyScope();
VarScopeThree v=new VarScopeThree();
v.verifyScopeTwo();




}
}
