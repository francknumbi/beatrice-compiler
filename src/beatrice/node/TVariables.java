/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class TVariables extends Token
{
    public TVariables()
    {
        super.setText("variables");
    }

    public TVariables(int line, int pos)
    {
        super.setText("variables");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVariables(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVariables(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVariables text.");
    }
}
