/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class AMessage extends PMessage
{
    private TConcat _concat_;
    private PMessageAdd _messageAdd_;

    public AMessage()
    {
        // Constructor
    }

    public AMessage(
        @SuppressWarnings("hiding") TConcat _concat_,
        @SuppressWarnings("hiding") PMessageAdd _messageAdd_)
    {
        // Constructor
        setConcat(_concat_);

        setMessageAdd(_messageAdd_);

    }

    @Override
    public Object clone()
    {
        return new AMessage(
            cloneNode(this._concat_),
            cloneNode(this._messageAdd_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMessage(this);
    }

    public TConcat getConcat()
    {
        return this._concat_;
    }

    public void setConcat(TConcat node)
    {
        if(this._concat_ != null)
        {
            this._concat_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._concat_ = node;
    }

    public PMessageAdd getMessageAdd()
    {
        return this._messageAdd_;
    }

    public void setMessageAdd(PMessageAdd node)
    {
        if(this._messageAdd_ != null)
        {
            this._messageAdd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._messageAdd_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._concat_)
            + toString(this._messageAdd_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._concat_ == child)
        {
            this._concat_ = null;
            return;
        }

        if(this._messageAdd_ == child)
        {
            this._messageAdd_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._concat_ == oldChild)
        {
            setConcat((TConcat) newChild);
            return;
        }

        if(this._messageAdd_ == oldChild)
        {
            setMessageAdd((PMessageAdd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
