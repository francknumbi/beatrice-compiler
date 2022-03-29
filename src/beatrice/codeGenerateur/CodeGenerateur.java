package beatrice.codeGenerateur;

import beatrice.analysis.DepthFirstAdapter;
import beatrice.node.AAlgorithmeProgramme;
import jas.CodeAttr;

public class CodeGenerateur extends DepthFirstAdapter {

    public void inAAlgorithmeProgramme(AAlgorithmeProgramme node)
    {
        CodeAttr init = new CodeAttr();
        CodeAttr main_code = new CodeAttr();
    }
}
