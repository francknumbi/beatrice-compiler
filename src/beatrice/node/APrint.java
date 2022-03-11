/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import java.util.*;
import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class APrint extends PPrint
{
    private TEcriture _ecriture_;
    private TIdentifiant _identifiant_;
    private final LinkedList<PMessage> _message_ = new LinkedList<PMessage>();

    public APrint()
    {
        // Constructor
    }

    public APrint(
        @SuppressWarnings("hiding") TEcriture _ecriture_,
        @SuppressWarnings("hiding") TIdentifiant _identifiant_,
        @SuppressWarnings("hiding") List<?> _message_)
    {
        // Constructor
        setEcriture(_ecriture_);

        setIdentifiant(_identifiant_);

        setMessage(_message_);

    }

    @Override
    public Object clone()
    {
        return new APrint(
            cloneNode(this._ecriture_),
            cloneNode(this._identifiant_),
            cloneList(this._message_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrint(this);
    }

    public TEcriture getEcriture()
    {
        return this._ecriture_;
    }

    public void setEcriture(TEcriture node)
    {
        if(this._ecriture_ != null)
        {
            this._ecriture_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ecriture_ = node;
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

    public LinkedList<PMessage> getMessage()
    {
        return this._message_;
    }

    public void setMessage(List<?> list)
    {
        for(PMessage e : this._message_)
        {
            e.parent(null);
        }
        this._message_.clear();

        for(Object obj_e : list)
        {
            PMessage e = (PMessage) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._message_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ecriture_)
            + toString(this._identifiant_)
            + toString(this._message_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ecriture_ == child)
        {
            this._ecriture_ = null;
            return;
        }

        if(this._identifiant_ == child)
        {
            this._identifiant_ = null;
            return;
        }

        if(this._message_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ecriture_ == oldChild)
        {
            setEcriture((TEcriture) newChild);
            return;
        }

        if(this._identifiant_ == oldChild)
        {
            setIdentifiant((TIdentifiant) newChild);
            return;
        }

        for(ListIterator<PMessage> i = this._message_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMessage) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
