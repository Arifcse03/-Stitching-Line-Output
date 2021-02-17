package mnj.ont.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 13 17:28:10 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class jobLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        WipEntityId {
            public Object get(jobLOVRowImpl obj) {
                return obj.getWipEntityId();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setWipEntityId((Number)value);
            }
        }
        ,
        WipEntityName {
            public Object get(jobLOVRowImpl obj) {
                return obj.getWipEntityName();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setWipEntityName((String)value);
            }
        }
        ,
        Stn {
            public Object get(jobLOVRowImpl obj) {
                return obj.getStn();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setStn((String)value);
            }
        }
        ,
        HeaderId {
            public Object get(jobLOVRowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        JobQty {
            public Object get(jobLOVRowImpl obj) {
                return obj.getJobQty();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setJobQty((Number)value);
            }
        }
        ,
        Description {
            public Object get(jobLOVRowImpl obj) {
                return obj.getDescription();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        OrderNumber {
            public Object get(jobLOVRowImpl obj) {
                return obj.getOrderNumber();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setOrderNumber((Number)value);
            }
        }
        ,
        LineId {
            public Object get(jobLOVRowImpl obj) {
                return obj.getLineId();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(jobLOVRowImpl obj) {
                return obj.getOrgId();
            }

            public void put(jobLOVRowImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(jobLOVRowImpl object);

        public abstract void put(jobLOVRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int WIPENTITYID = AttributesEnum.WipEntityId.index();
    public static final int WIPENTITYNAME = AttributesEnum.WipEntityName.index();
    public static final int STN = AttributesEnum.Stn.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int JOBQTY = AttributesEnum.JobQty.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int ORDERNUMBER = AttributesEnum.OrderNumber.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public jobLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute WipEntityId.
     * @return the WipEntityId
     */
    public Number getWipEntityId() {
        return (Number) getAttributeInternal(WIPENTITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WipEntityId.
     * @param value value to set the  WipEntityId
     */
    public void setWipEntityId(Number value) {
        setAttributeInternal(WIPENTITYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WipEntityName.
     * @return the WipEntityName
     */
    public String getWipEntityName() {
        return (String) getAttributeInternal(WIPENTITYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WipEntityName.
     * @param value value to set the  WipEntityName
     */
    public void setWipEntityName(String value) {
        setAttributeInternal(WIPENTITYNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Stn.
     * @return the Stn
     */
    public String getStn() {
        return (String) getAttributeInternal(STN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Stn.
     * @param value value to set the  Stn
     */
    public void setStn(String value) {
        setAttributeInternal(STN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HeaderId.
     * @param value value to set the  HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute JobQty.
     * @return the JobQty
     */
    public Number getJobQty() {
        return (Number) getAttributeInternal(JOBQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute JobQty.
     * @param value value to set the  JobQty
     */
    public void setJobQty(Number value) {
        setAttributeInternal(JOBQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Description.
     * @param value value to set the  Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderNumber.
     * @return the OrderNumber
     */
    public Number getOrderNumber() {
        return (Number) getAttributeInternal(ORDERNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderNumber.
     * @param value value to set the  OrderNumber
     */
    public void setOrderNumber(Number value) {
        setAttributeInternal(ORDERNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LineId.
     * @param value value to set the  LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
