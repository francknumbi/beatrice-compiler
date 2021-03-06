/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleCondition extends PCondition
{
    private PConditionSimple _conditionSimple_;

    public ASimpleCondition()
    {
        // Constructor
    }

    public ASimpleCondition(
        @SuppressWarnings("hiding") PConditionSimple _conditionSimple_)
    {
        // Constructor
        setConditionSimple(_conditionSimple_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleCondition(
            cloneNode(this._conditionSimple_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleCondition(this);
    }

    public PConditionSimple getConditionSimple()
    {
        return this._conditionSimple_;
    }

    public void setConditionSimple(PConditionSimple node)
    {
        if(this._conditionSimple_ != null)
        {
            this._conditionSimple_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditionSimple_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conditionSimple_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._conditionSimple_ == child)
        {
            this._conditionSimple_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._conditionSimple_ == oldChild)
        {
            setConditionSimple((PConditionSimple) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
