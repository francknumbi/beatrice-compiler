/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class AIdentifiantTerme extends PTerme
{
    private TIdentifiant _identifiant_;

    public AIdentifiantTerme()
    {
        // Constructor
    }

    public AIdentifiantTerme(
        @SuppressWarnings("hiding") TIdentifiant _identifiant_)
    {
        // Constructor
        setIdentifiant(_identifiant_);

    }

    @Override
    public Object clone()
    {
        return new AIdentifiantTerme(
            cloneNode(this._identifiant_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentifiantTerme(this);
    }

    public TIdentifiant getIdentifiant()
    {
        return this._identifiant_;
    }

    public void setIdentifiant(TIdentifiant node)
    {
        if(this._identifiant_ != null)
        {
            this._identifiant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifiant_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifiant_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifiant_ == child)
        {
            this._identifiant_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifiant_ == oldChild)
        {
            setIdentifiant((TIdentifiant) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}