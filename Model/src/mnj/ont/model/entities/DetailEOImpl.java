package mnj.ont.model.entities;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 18 17:35:44 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DetailEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DivisionId {
            public Object get(DetailEOImpl obj) {
                return obj.getDivisionId();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setDivisionId((String)value);
            }
        }
        ,
        ProdTransId {
            public Object get(DetailEOImpl obj) {
                return obj.getProdTransId();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setProdTransId((Number)value);
            }
        }
        ,
        OutSublineId {
            public Object get(DetailEOImpl obj) {
                return obj.getOutSublineId();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setOutSublineId((Number)value);
            }
        }
        ,
        DetailId {
            public Object get(DetailEOImpl obj) {
                return obj.getDetailId();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        ProductionQuantity {
            public Object get(DetailEOImpl obj) {
                return obj.getProductionQuantity();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setProductionQuantity((String)value);
            }
        }
        ,
        ProdQty {
            public Object get(DetailEOImpl obj) {
                return obj.getProdQty();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setProdQty((String)value);
            }
        }
        ,
        Cutqty {
            public Object get(DetailEOImpl obj) {
                return obj.getCutqty();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setCutqty((Number)value);
            }
        }
        ,
        Rejection {
            public Object get(DetailEOImpl obj) {
                return obj.getRejection();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setRejection((Number)value);
            }
        }
        ,
        SizeVal {
            public Object get(DetailEOImpl obj) {
                return obj.getSizeVal();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setSizeVal((String)value);
            }
        }
        ,
        PrevProdQty {
            public Object get(DetailEOImpl obj) {
                return obj.getPrevProdQty();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setPrevProdQty((Number)value);
            }
        }
        ,
        TotalInput {
            public Object get(DetailEOImpl obj) {
                return obj.getTotalInput();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setTotalInput((Number)value);
            }
        }
        ,
        DayProoduction {
            public Object get(DetailEOImpl obj) {
                return obj.getDayProoduction();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setDayProoduction((Number)value);
            }
        }
        ,
        TotalProduction {
            public Object get(DetailEOImpl obj) {
                return obj.getTotalProduction();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setTotalProduction((Number)value);
            }
        }
        ,
        TotalRejection {
            public Object get(DetailEOImpl obj) {
                return obj.getTotalRejection();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setTotalRejection((Number)value);
            }
        }
        ,
        Wip {
            public Object get(DetailEOImpl obj) {
                return obj.getWip();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setWip((Number)value);
            }
        }
        ,
        Inseem {
            public Object get(DetailEOImpl obj) {
                return obj.getInseem();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setInseem((String)value);
            }
        }
        ,
        R1 {
            public Object get(DetailEOImpl obj) {
                return obj.getR1();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR1((Number)value);
            }
        }
        ,
        R2 {
            public Object get(DetailEOImpl obj) {
                return obj.getR2();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR2((Number)value);
            }
        }
        ,
        R3 {
            public Object get(DetailEOImpl obj) {
                return obj.getR3();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR3((Number)value);
            }
        }
        ,
        R4 {
            public Object get(DetailEOImpl obj) {
                return obj.getR4();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR4((Number)value);
            }
        }
        ,
        R5 {
            public Object get(DetailEOImpl obj) {
                return obj.getR5();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR5((Number)value);
            }
        }
        ,
        R6 {
            public Object get(DetailEOImpl obj) {
                return obj.getR6();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR6((Number)value);
            }
        }
        ,
        R7 {
            public Object get(DetailEOImpl obj) {
                return obj.getR7();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR7((Number)value);
            }
        }
        ,
        R8 {
            public Object get(DetailEOImpl obj) {
                return obj.getR8();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR8((Number)value);
            }
        }
        ,
        R9 {
            public Object get(DetailEOImpl obj) {
                return obj.getR9();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR9((Number)value);
            }
        }
        ,
        R10 {
            public Object get(DetailEOImpl obj) {
                return obj.getR10();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR10((Number)value);
            }
        }
        ,
        R11 {
            public Object get(DetailEOImpl obj) {
                return obj.getR11();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR11((Number)value);
            }
        }
        ,
        R12 {
            public Object get(DetailEOImpl obj) {
                return obj.getR12();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR12((Number)value);
            }
        }
        ,
        R13 {
            public Object get(DetailEOImpl obj) {
                return obj.getR13();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setR13((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(DetailEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(DetailEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(DetailEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(DetailEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LineEO {
            public Object get(DetailEOImpl obj) {
                return obj.getLineEO();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setLineEO((LineEOImpl)value);
            }
        }
        ,
        LineEO1 {
            public Object get(DetailEOImpl obj) {
                return obj.getLineEO1();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setLineEO1((LineEOImpl)value);
            }
        }
        ,
        LineEO2 {
            public Object get(DetailEOImpl obj) {
                return obj.getLineEO2();
            }

            public void put(DetailEOImpl obj, Object value) {
                obj.setLineEO2((LineEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(DetailEOImpl object);

        public abstract void put(DetailEOImpl object, Object value);

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


 //   public static final int LINEEO1 = AttributesEnum.LineEO1.index();


    public static final int DIVISIONID = AttributesEnum.DivisionId.index();
    public static final int PRODTRANSID = AttributesEnum.ProdTransId.index();
    public static final int OUTSUBLINEID = AttributesEnum.OutSublineId.index();
    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int PRODUCTIONQUANTITY = AttributesEnum.ProductionQuantity.index();
    public static final int PRODQTY = AttributesEnum.ProdQty.index();
    public static final int CUTQTY = AttributesEnum.Cutqty.index();
    public static final int REJECTION = AttributesEnum.Rejection.index();
    public static final int SIZEVAL = AttributesEnum.SizeVal.index();
    public static final int PREVPRODQTY = AttributesEnum.PrevProdQty.index();
    public static final int TOTALINPUT = AttributesEnum.TotalInput.index();
    public static final int DAYPROODUCTION = AttributesEnum.DayProoduction.index();
    public static final int TOTALPRODUCTION = AttributesEnum.TotalProduction.index();
    public static final int TOTALREJECTION = AttributesEnum.TotalRejection.index();
    public static final int WIP = AttributesEnum.Wip.index();
    public static final int INSEEM = AttributesEnum.Inseem.index();
    public static final int R1 = AttributesEnum.R1.index();
    public static final int R2 = AttributesEnum.R2.index();
    public static final int R3 = AttributesEnum.R3.index();
    public static final int R4 = AttributesEnum.R4.index();
    public static final int R5 = AttributesEnum.R5.index();
    public static final int R6 = AttributesEnum.R6.index();
    public static final int R7 = AttributesEnum.R7.index();
    public static final int R8 = AttributesEnum.R8.index();
    public static final int R9 = AttributesEnum.R9.index();
    public static final int R10 = AttributesEnum.R10.index();
    public static final int R11 = AttributesEnum.R11.index();
    public static final int R12 = AttributesEnum.R12.index();
    public static final int R13 = AttributesEnum.R13.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LINEEO = AttributesEnum.LineEO.index();
    public static final int LINEEO1 = AttributesEnum.LineEO1.index();
    public static final int LINEEO2 = AttributesEnum.LineEO2.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DetailEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.ont.model.entities.DetailEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DivisionId, using the alias name DivisionId.
     * @return the DivisionId
     */
    public String getDivisionId() {
        return (String)getAttributeInternal(DIVISIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DivisionId.
     * @param value value to set the DivisionId
     */
    public void setDivisionId(String value) {
        setAttributeInternal(DIVISIONID, value);
    }

    /**
     * Gets the attribute value for ProdTransId, using the alias name ProdTransId.
     * @return the ProdTransId
     */
    public Number getProdTransId() {
        return (Number)getAttributeInternal(PRODTRANSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProdTransId.
     * @param value value to set the ProdTransId
     */
    public void setProdTransId(Number value) {
        setAttributeInternal(PRODTRANSID, value);
    }

    /**
     * Gets the attribute value for OutSublineId, using the alias name OutSublineId.
     * @return the OutSublineId
     */
    public Number getOutSublineId() {
        return (Number)getAttributeInternal(OUTSUBLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OutSublineId.
     * @param value value to set the OutSublineId
     */
    public void setOutSublineId(Number value) {
        setAttributeInternal(OUTSUBLINEID, value);
    }

    /**
     * Gets the attribute value for DetailId, using the alias name DetailId.
     * @return the DetailId
     */
    public Number getDetailId() {
        return (Number)getAttributeInternal(DETAILID);
    }


    /**
     * Sets <code>value</code> as the attribute value for DetailId.
     * @param value value to set the DetailId
     */
    public void setDetailId(Number value) {
        setAttributeInternal(DETAILID, value);
    }

    /**
     * Gets the attribute value for ProductionQuantity, using the alias name ProductionQuantity.
     * @return the ProductionQuantity
     */
    public String getProductionQuantity() {
        return (String)getAttributeInternal(PRODUCTIONQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductionQuantity.
     * @param value value to set the ProductionQuantity
     */
    public void setProductionQuantity(String value) {
        setAttributeInternal(PRODUCTIONQUANTITY, value);
    }

    /**
     * Gets the attribute value for ProdQty, using the alias name ProdQty.
     * @return the ProdQty
     */
    public String getProdQty() {
        return (String)getAttributeInternal(PRODQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProdQty.
     * @param value value to set the ProdQty
     */
    public void setProdQty(String value) {
        setAttributeInternal(PRODQTY, value);
    }

    /**
     * Gets the attribute value for Cutqty, using the alias name Cutqty.
     * @return the Cutqty
     */
    public Number getCutqty() {
        return (Number)getAttributeInternal(CUTQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cutqty.
     * @param value value to set the Cutqty
     */
    public void setCutqty(Number value) {
        setAttributeInternal(CUTQTY, value);
    }

    /**
     * Gets the attribute value for Rejection, using the alias name Rejection.
     * @return the Rejection
     */
    public Number getRejection() {
        return (Number)getAttributeInternal(REJECTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rejection.
     * @param value value to set the Rejection
     */
    public void setRejection(Number value) {
        setAttributeInternal(REJECTION, value);
    }

    /**
     * Gets the attribute value for SizeVal, using the alias name SizeVal.
     * @return the SizeVal
     */
    public String getSizeVal() {
        return (String)getAttributeInternal(SIZEVAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeVal.
     * @param value value to set the SizeVal
     */
    public void setSizeVal(String value) {
        setAttributeInternal(SIZEVAL, value);
    }

    /**
     * Gets the attribute value for PrevProdQty, using the alias name PrevProdQty.
     * @return the PrevProdQty
     */
    public Number getPrevProdQty() {
        return (Number)getAttributeInternal(PREVPRODQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrevProdQty.
     * @param value value to set the PrevProdQty
     */
    public void setPrevProdQty(Number value) {
        setAttributeInternal(PREVPRODQTY, value);
    }

    /**
     * Gets the attribute value for TotalInput, using the alias name TotalInput.
     * @return the TotalInput
     */
    public Number getTotalInput() {
        return (Number)getAttributeInternal(TOTALINPUT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalInput.
     * @param value value to set the TotalInput
     */
    public void setTotalInput(Number value) {
        setAttributeInternal(TOTALINPUT, value);
    }

    /**
     * Gets the attribute value for DayProoduction, using the alias name DayProoduction.
     * @return the DayProoduction
     */
    public Number getDayProoduction() {
        return (Number)getAttributeInternal(DAYPROODUCTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for DayProoduction.
     * @param value value to set the DayProoduction
     */
    public void setDayProoduction(Number value) {
        setAttributeInternal(DAYPROODUCTION, value);
    }

    /**
     * Gets the attribute value for TotalProduction, using the alias name TotalProduction.
     * @return the TotalProduction
     */
    public Number getTotalProduction() {
        return (Number)getAttributeInternal(TOTALPRODUCTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalProduction.
     * @param value value to set the TotalProduction
     */
    public void setTotalProduction(Number value) {
        setAttributeInternal(TOTALPRODUCTION, value);
    }

    /**
     * Gets the attribute value for TotalRejection, using the alias name TotalRejection.
     * @return the TotalRejection
     */
    public Number getTotalRejection() {
        return (Number)getAttributeInternal(TOTALREJECTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalRejection.
     * @param value value to set the TotalRejection
     */
    public void setTotalRejection(Number value) {
        setAttributeInternal(TOTALREJECTION, value);
    }

    /**
     * Gets the attribute value for Wip, using the alias name Wip.
     * @return the Wip
     */
    public Number getWip() {
        return (Number)getAttributeInternal(WIP);
    }

    /**
     * Sets <code>value</code> as the attribute value for Wip.
     * @param value value to set the Wip
     */
    public void setWip(Number value) {
        setAttributeInternal(WIP, value);
    }

    /**
     * Gets the attribute value for Inseem, using the alias name Inseem.
     * @return the Inseem
     */
    public String getInseem() {
        return (String)getAttributeInternal(INSEEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Inseem.
     * @param value value to set the Inseem
     */
    public void setInseem(String value) {
        setAttributeInternal(INSEEM, value);
    }

    /**
     * Gets the attribute value for R1, using the alias name R1.
     * @return the R1
     */
    public Number getR1() {
        return (Number)getAttributeInternal(R1);
    }

    /**
     * Sets <code>value</code> as the attribute value for R1.
     * @param value value to set the R1
     */
    public void setR1(Number value) {
        setAttributeInternal(R1, value);
    }

    /**
     * Gets the attribute value for R2, using the alias name R2.
     * @return the R2
     */
    public Number getR2() {
        return (Number)getAttributeInternal(R2);
    }

    /**
     * Sets <code>value</code> as the attribute value for R2.
     * @param value value to set the R2
     */
    public void setR2(Number value) {
        setAttributeInternal(R2, value);
    }

    /**
     * Gets the attribute value for R3, using the alias name R3.
     * @return the R3
     */
    public Number getR3() {
        return (Number)getAttributeInternal(R3);
    }

    /**
     * Sets <code>value</code> as the attribute value for R3.
     * @param value value to set the R3
     */
    public void setR3(Number value) {
        setAttributeInternal(R3, value);
    }

    /**
     * Gets the attribute value for R4, using the alias name R4.
     * @return the R4
     */
    public Number getR4() {
        return (Number)getAttributeInternal(R4);
    }

    /**
     * Sets <code>value</code> as the attribute value for R4.
     * @param value value to set the R4
     */
    public void setR4(Number value) {
        setAttributeInternal(R4, value);
    }

    /**
     * Gets the attribute value for R5, using the alias name R5.
     * @return the R5
     */
    public Number getR5() {
        return (Number)getAttributeInternal(R5);
    }

    /**
     * Sets <code>value</code> as the attribute value for R5.
     * @param value value to set the R5
     */
    public void setR5(Number value) {
        setAttributeInternal(R5, value);
    }

    /**
     * Gets the attribute value for R6, using the alias name R6.
     * @return the R6
     */
    public Number getR6() {
        return (Number)getAttributeInternal(R6);
    }

    /**
     * Sets <code>value</code> as the attribute value for R6.
     * @param value value to set the R6
     */
    public void setR6(Number value) {
        setAttributeInternal(R6, value);
    }

    /**
     * Gets the attribute value for R7, using the alias name R7.
     * @return the R7
     */
    public Number getR7() {
        return (Number)getAttributeInternal(R7);
    }

    /**
     * Sets <code>value</code> as the attribute value for R7.
     * @param value value to set the R7
     */
    public void setR7(Number value) {
        setAttributeInternal(R7, value);
    }

    /**
     * Gets the attribute value for R8, using the alias name R8.
     * @return the R8
     */
    public Number getR8() {
        return (Number)getAttributeInternal(R8);
    }

    /**
     * Sets <code>value</code> as the attribute value for R8.
     * @param value value to set the R8
     */
    public void setR8(Number value) {
        setAttributeInternal(R8, value);
    }

    /**
     * Gets the attribute value for R9, using the alias name R9.
     * @return the R9
     */
    public Number getR9() {
        return (Number)getAttributeInternal(R9);
    }

    /**
     * Sets <code>value</code> as the attribute value for R9.
     * @param value value to set the R9
     */
    public void setR9(Number value) {
        setAttributeInternal(R9, value);
    }

    /**
     * Gets the attribute value for R10, using the alias name R10.
     * @return the R10
     */
    public Number getR10() {
        return (Number)getAttributeInternal(R10);
    }

    /**
     * Sets <code>value</code> as the attribute value for R10.
     * @param value value to set the R10
     */
    public void setR10(Number value) {
        setAttributeInternal(R10, value);
    }

    /**
     * Gets the attribute value for R11, using the alias name R11.
     * @return the R11
     */
    public Number getR11() {
        return (Number)getAttributeInternal(R11);
    }

    /**
     * Sets <code>value</code> as the attribute value for R11.
     * @param value value to set the R11
     */
    public void setR11(Number value) {
        setAttributeInternal(R11, value);
    }

    /**
     * Gets the attribute value for R12, using the alias name R12.
     * @return the R12
     */
    public Number getR12() {
        return (Number)getAttributeInternal(R12);
    }

    /**
     * Sets <code>value</code> as the attribute value for R12.
     * @param value value to set the R12
     */
    public void setR12(Number value) {
        setAttributeInternal(R12, value);
    }

    /**
     * Gets the attribute value for R13, using the alias name R13.
     * @return the R13
     */
    public Number getR13() {
        return (Number)getAttributeInternal(R13);
    }

    /**
     * Sets <code>value</code> as the attribute value for R13.
     * @param value value to set the R13
     */
    public void setR13(Number value) {
        setAttributeInternal(R13, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
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

    /**
     * @return the associated entity LineEOImpl.
     */
    public LineEOImpl getLineEO() {
        return (LineEOImpl)getAttributeInternal(LINEEO);
    }

    /**
     * Sets <code>value</code> as the associated entity LineEOImpl.
     */
    public void setLineEO(LineEOImpl value) {
        setAttributeInternal(LINEEO, value);
    }


    /**
     * @return the associated entity LineEOImpl.
     */
 //   public LineEOImpl getLineEO1() {
  //      return (LineEOImpl)getAttributeInternal(LINEEO1);
  //  }


    /**
     * @return the associated entity LineEOImpl.
     */
    public LineEOImpl getLineEO1() {
        return (LineEOImpl)getAttributeInternal(LINEEO1);
    }

    /**
     * Sets <code>value</code> as the associated entity LineEOImpl.
     */
    public void setLineEO1(LineEOImpl value) {
        setAttributeInternal(LINEEO1, value);
    }


    /**
     * @return the associated entity LineEOImpl.
     */
    public LineEOImpl getLineEO2() {
        return (LineEOImpl)getAttributeInternal(LINEEO2);
    }

    /**
     * Sets <code>value</code> as the associated entity LineEOImpl.
     */
    public void setLineEO2(LineEOImpl value) {
        setAttributeInternal(LINEEO2, value);
    }


    /**
     * @param detailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number detailId) {
        return new Key(new Object[]{detailId});
    }

    /**
     * Sets <code>value</code> as the associated entity LineEOImpl.
     */
  //  public void setLineEO1(LineEOImpl value) {
   //     setAttributeInternal(LINEEO1, value);
   // }


    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        Integer empno =Integer.parseInt(new oracle.jbo.server.SequenceImpl("MNJ_MFG_LINEOUTPUT_DETAIL_S", getDBTransaction()).getSequenceNumber().toString());
           oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_LINEOUTPUT_DETAIL_S",getDBTransaction());
           oracle.jbo.domain.Number sVal = s.getSequenceNumber();
           setDetailId(sVal);
           //cust_mnj_ont_pkg.cust_mnj_packassort_srno
    }
    
    /**
         * Custom DML update/insert/delete logic here.
         * @param operation the operation type
         * @param e the transaction event
         */
        protected void doDML(int operation, TransactionEvent e) {
            Map sessionScope = ADFContext.getCurrent().getSessionScope();   
            String user = (String)sessionScope.get("userId");
            String orgId  =(String)sessionScope.get("orgId");
            String unitName  =(String)sessionScope.get("unitName");
            
            System.out.println("ASSES INS DO DML 1 ------------------>"+user);
            System.out.println("ASSES INS DO DML 2------------------>"+orgId);
            System.out.println("ASSES INS DML 3 ------------------>"+unitName);
            
            if(DML_UPDATE == operation){
                      try {
                          
                          setLastUpdateDate((Date)Date.getCurrentDate()); 
                          setLastUpdatedBy(new oracle.jbo.domain.Number(user));
                      } catch (SQLException f) {
                          System.out.println(f.getMessage());
                      }
                  }
                  else if (DML_INSERT == operation){
                   
                      try {
                          
                          //setHeaderNo(getSrNoString());
                          //setOrgId(new oracle.jbo.domain.Number(orgId));
                          //setAttribute1(unitName);
                          setCreationDate((Date)Date.getCurrentDate());  
                          setCreatedBy(new oracle.jbo.domain.Number(user));
                         
                         
                         
                      } catch (SQLException f) {
                          ;
                      }
                  } 
            
            super.doDML(operation, e);
        }


}
