/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class AInfegalConditionSimple extends PConditionSimple
{
    private PExpress _gauche_;
    private TOperateurInferieurEgal _operateurInferieurEgal_;
    private PExpress _droite_;

    public AInfegalConditionSimple()
    {
        // Constructor
    }

    public AInfegalConditionSimple(
        @SuppressWarnings("hiding") PExpress _gauche_,
        @SuppressWarnings("hiding") TOperateurInferieurEgal _operateurInferieurEgal_,
        @SuppressWarnings("hiding") PExpress _droite_)
    {
        // Constructor
        setGauche(_gauche_);

        setOperateurInferieurEgal(_operateurInferieurEgal_);

        setDroite(_droite_);

    }

    @Override
    public Object clone()
    {
        return new AInfegalConditionSimple(
            cloneNode(this._gauche_),
            cloneNode(this._operateurInferieurEgal_),
            cloneNode(this._droite_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInfegalConditionSimple(this);
    }

    public PExpress getGauche()
    {
        return this._gauche_;
    }

    public void setGauche(PExpress node)
    {
        if(this._gauche_ != null)
        {
            this._gauche_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._gauche_ = node;
    }

    public TOperateurInferieurEgal getOperateurInferieurEgal()
    {
        return this._operateurInferieurEgal_;
    }

    public void setOperateurInferieurEgal(TOperateurInferieurEgal node)
    {
        if(this._operateurInferieurEgal_ != null)
        {
            this._operateurInferieurEgal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operateurInferieurEgal_ = node;
    }

    public PExpress getDroite()
    {
        return this._droite_;
    }

    public void setDroite(PExpress node)
    {
        if(this._droite_ != null)
        {
            this._droite_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._droite_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._gauche_)
            + toString(this._operateurInferieurEgal_)
            + toString(this._droite_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._gauche_ == child)
        {
            this._gauche_ = null;
            return;
        }

        if(this._operateurInferieurEgal_ == child)
        {
            this._operateurInferieurEgal_ = null;
            return;
        }

        if(this._droite_ == child)
        {
            this._droite_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._gauche_ == oldChild)
        {
            setGauche((PExpress) newChild);
            return;
        }

        if(this._operateurInferieurEgal_ == oldChild)
        {
            setOperateurInferieurEgal((TOperateurInferieurEgal) newChild);
            return;
        }

        if(this._droite_ == oldChild)
        {
            setDroite((PExpress) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
