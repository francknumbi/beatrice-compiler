/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class AEcritureInstructions extends PInstructions
{
    private PInput _input_;

    public AEcritureInstructions()
    {
        // Constructor
    }

    public AEcritureInstructions(
        @SuppressWarnings("hiding") PInput _input_)
    {
        // Constructor
        setInput(_input_);

    }

    @Override
    public Object clone()
    {
        return new AEcritureInstructions(
            cloneNode(this._input_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEcritureInstructions(this);
    }

    public PInput getInput()
    {
        return this._input_;
    }

    public void setInput(PInput node)
    {
        if(this._input_ != null)
        {
            this._input_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._input_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._input_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._input_ == child)
        {
            this._input_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._input_ == oldChild)
        {
            setInput((PInput) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
