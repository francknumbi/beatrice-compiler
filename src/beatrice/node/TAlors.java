/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class TAlors extends Token
{
    public TAlors()
    {
        super.setText("alors");
    }

    public TAlors(int line, int pos)
    {
        super.setText("alors");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAlors(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAlors(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAlors text.");
    }
}
