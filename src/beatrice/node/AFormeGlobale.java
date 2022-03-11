/* This file was generated by SableCC (http://www.sablecc.org/). */

package beatrice.node;

import java.util.*;
import beatrice.analysis.*;

@SuppressWarnings("nls")
public final class AFormeGlobale extends PFormeGlobale
{
    private TSi _si_;
    private PCondition _condition_;
    private TAlors _alors_;
    private final LinkedList<PInstructions> _instructions_ = new LinkedList<PInstructions>();
    private final LinkedList<PSinonsi> _sinonsi_ = new LinkedList<PSinonsi>();
    private PConditionAdditionnelles _conditionAdditionnelles_;
    private TFinsi _finsi_;

    public AFormeGlobale()
    {
        // Constructor
    }

    public AFormeGlobale(
        @SuppressWarnings("hiding") TSi _si_,
        @SuppressWarnings("hiding") PCondition _condition_,
        @SuppressWarnings("hiding") TAlors _alors_,
        @SuppressWarnings("hiding") List<?> _instructions_,
        @SuppressWarnings("hiding") List<?> _sinonsi_,
        @SuppressWarnings("hiding") PConditionAdditionnelles _conditionAdditionnelles_,
        @SuppressWarnings("hiding") TFinsi _finsi_)
    {
        // Constructor
        setSi(_si_);

        setCondition(_condition_);

        setAlors(_alors_);

        setInstructions(_instructions_);

        setSinonsi(_sinonsi_);

        setConditionAdditionnelles(_conditionAdditionnelles_);

        setFinsi(_finsi_);

    }

    @Override
    public Object clone()
    {
        return new AFormeGlobale(
            cloneNode(this._si_),
            cloneNode(this._condition_),
            cloneNode(this._alors_),
            cloneList(this._instructions_),
            cloneList(this._sinonsi_),
            cloneNode(this._conditionAdditionnelles_),
            cloneNode(this._finsi_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFormeGlobale(this);
    }

    public TSi getSi()
    {
        return this._si_;
    }

    public void setSi(TSi node)
    {
        if(this._si_ != null)
        {
            this._si_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._si_ = node;
    }

    public PCondition getCondition()
    {
        return this._condition_;
    }

    public void setCondition(PCondition node)
    {
        if(this._condition_ != null)
        {
            this._condition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condition_ = node;
    }

    public TAlors getAlors()
    {
        return this._alors_;
    }

    public void setAlors(TAlors node)
    {
        if(this._alors_ != null)
        {
            this._alors_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._alors_ = node;
    }

    public LinkedList<PInstructions> getInstructions()
    {
        return this._instructions_;
    }

    public void setInstructions(List<?> list)
    {
        for(PInstructions e : this._instructions_)
        {
            e.parent(null);
        }
        this._instructions_.clear();

        for(Object obj_e : list)
        {
            PInstructions e = (PInstructions) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._instructions_.add(e);
        }
    }

    public LinkedList<PSinonsi> getSinonsi()
    {
        return this._sinonsi_;
    }

    public void setSinonsi(List<?> list)
    {
        for(PSinonsi e : this._sinonsi_)
        {
            e.parent(null);
        }
        this._sinonsi_.clear();

        for(Object obj_e : list)
        {
            PSinonsi e = (PSinonsi) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._sinonsi_.add(e);
        }
    }

    public PConditionAdditionnelles getConditionAdditionnelles()
    {
        return this._conditionAdditionnelles_;
    }

    public void setConditionAdditionnelles(PConditionAdditionnelles node)
    {
        if(this._conditionAdditionnelles_ != null)
        {
            this._conditionAdditionnelles_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditionAdditionnelles_ = node;
    }

    public TFinsi getFinsi()
    {
        return this._finsi_;
    }

    public void setFinsi(TFinsi node)
    {
        if(this._finsi_ != null)
        {
            this._finsi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._finsi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._si_)
            + toString(this._condition_)
            + toString(this._alors_)
            + toString(this._instructions_)
            + toString(this._sinonsi_)
            + toString(this._conditionAdditionnelles_)
            + toString(this._finsi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._si_ == child)
        {
            this._si_ = null;
            return;
        }

        if(this._condition_ == child)
        {
            this._condition_ = null;
            return;
        }

        if(this._alors_ == child)
        {
            this._alors_ = null;
            return;
        }

        if(this._instructions_.remove(child))
        {
            return;
        }

        if(this._sinonsi_.remove(child))
        {
            return;
        }

        if(this._conditionAdditionnelles_ == child)
        {
            this._conditionAdditionnelles_ = null;
            return;
        }

        if(this._finsi_ == child)
        {
            this._finsi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._si_ == oldChild)
        {
            setSi((TSi) newChild);
            return;
        }

        if(this._condition_ == oldChild)
        {
            setCondition((PCondition) newChild);
            return;
        }

        if(this._alors_ == oldChild)
        {
            setAlors((TAlors) newChild);
            return;
        }

        for(ListIterator<PInstructions> i = this._instructions_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PInstructions) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PSinonsi> i = this._sinonsi_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSinonsi) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._conditionAdditionnelles_ == oldChild)
        {
            setConditionAdditionnelles((PConditionAdditionnelles) newChild);
            return;
        }

        if(this._finsi_ == oldChild)
        {
            setFinsi((TFinsi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
