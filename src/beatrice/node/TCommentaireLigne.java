/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class TCommentaireLigne extends Token
{
    public TCommentaireLigne(String text)
    {
        setText(text);
    }

    public TCommentaireLigne(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCommentaireLigne(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCommentaireLigne(this);
    }
}
