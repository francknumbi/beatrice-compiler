/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class AAfficherInstructions extends PInstructions
{
    private PPrint _print_;

    public AAfficherInstructions()
    {
        // Constructor
    }

    public AAfficherInstructions(
        @SuppressWarnings("hiding") PPrint _print_)
    {
        // Constructor
        setPrint(_print_);

    }

    @Override
    public Object clone()
    {
        return new AAfficherInstructions(
            cloneNode(this._print_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAfficherInstructions(this);
    }

    public PPrint getPrint()
    {
        return this._print_;
    }

    public void setPrint(PPrint node)
    {
        if(this._print_ != null)
        {
            this._print_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._print_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._print_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._print_ == child)
        {
            this._print_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._print_ == oldChild)
        {
            setPrint((PPrint) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
