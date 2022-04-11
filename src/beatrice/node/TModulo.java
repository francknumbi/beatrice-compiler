/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class TModulo extends Token
{
    public TModulo()
    {
        super.setText("mod");
    }

    public TModulo(int line, int pos)
    {
        super.setText("mod");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TModulo(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTModulo(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TModulo text.");
    }
}