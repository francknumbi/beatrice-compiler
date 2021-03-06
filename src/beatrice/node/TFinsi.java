/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class TFinsi extends Token
{
    public TFinsi()
    {
        super.setText("finsi");
    }

    public TFinsi(int line, int pos)
    {
        super.setText("finsi");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFinsi(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFinsi(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFinsi text.");
    }
}
