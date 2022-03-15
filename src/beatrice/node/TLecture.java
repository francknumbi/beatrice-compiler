/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class TLecture extends Token
{
    public TLecture()
    {
        super.setText("lire");
    }

    public TLecture(int line, int pos)
    {
        super.setText("lire");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLecture(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLecture(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLecture text.");
    }
}