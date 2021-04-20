package view.backing_bean;

import java.io.IOException;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.text.DecimalFormat;

import java.util.Hashtable;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mnj.ont.model.services.InquiryInfoAMImpl;

import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.binding.BindingContainer;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.jbo.domain.Number;

import oracle.binding.OperationBinding;

import oracle.adf.model.binding.DCDataControl;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adf.view.rich.util.ResetUtils;

import oracle.jbo.ApplicationModule;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

import oracle.jdbc.OracleTypes;


public class Main {
    private RichInputText headerId;
    private RichInputText customerBuyerID;
    private RichInputText saleOrderHeaderID;
    private RichInputText prvLineoutput;
    private RichInputText balanceOutput;
    private RichInputText balanceQty;
    private RichTable ratioPlanTable;
    private RichInputListOfValues stn;
    private RichInputListOfValues style;
    ViewObject layPlanViewObject;
    private RichTable testTable;
    private RichTable size;
    private RichTable sizeTable;
    private RichOutputText totalProduetion;
    private RichInputText totRejection;
    private RichInputText wip;
    private RichInputText totalInputdetail;
    private RichOutputText totalInputLine;
    private RichInputText lineID;
    private RichInputText sizeId;
    private RichPanelLabelAndMessage attributeSave;
    private RichColumn outSublineId;
    private RichTable ietable;
    private RichTable offStandardLine;
    private RichTable selectAllTable;
    private RichInputText timesLine;
    private RichInputText timesDetail;
    ViewObject OffStandard;
    private RichTable offStandardLineTable;
    private RichInputText workingHourBasic;
    private RichInputText manpowerBasic;
    private RichInputText workingHourOvertime;
    private RichInputText manpowerOvertime;
    private RichInputText workingHourExtraot1;
    private RichInputText manPowerExtraot1;
    private RichInputText workingHourExtraot2;
    private RichInputText manPowerExtraot2;
    private RichInputText totalProduceMinutes;
    private RichInputText totalAttendedMinHeder;
    private RichInputText totalProductionHeader;
    private RichInputText totalStandardMinutesH;
    private RichInputText dayProd;
    private RichInputListOfValues samvalue;
    private RichInputText prodmin;
    private RichTable additionalblocktable;
    private RichTable fillBpoTable;
    public static final int VARCHAR2 = OracleTypes.VARCHAR;
    public static final int NUMBER = OracleTypes.NUMBER;
    public static final int DATE = OracleTypes.DATE;
    public static final int STRING = 1;
    public static final int INT = 2;
    public static final int DOUBLE = 3;


    public Main() {
        super();
        
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl");
        ApplicationModule am = dc.getApplicationModule();
         layPlanViewObject = am.findViewObject("DetailVO1"); 
         
         
        BindingContext bindingContext1 = BindingContext.getCurrent();
        DCDataControl dc1 =bindingContext1.findDataControl("InquiryInfoAMDataControl");
        ApplicationModule am1 = dc1.getApplicationModule();
         OffStandard = am1.findViewObject("OffStandardLineVO1"); 
        
    }
    
    public InquiryInfoAMImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("InquiryInfoAMDataControl"); // Name of application module in datacontrolBinding.cpx
       InquiryInfoAMImpl appM = (InquiryInfoAMImpl)dc.getDataProvider();
        return appM;
    }
    InquiryInfoAMImpl am =  getAppModuleImpl();
    
    public void editPopupFetchListener(PopupFetchEvent popupFetchEvent) {
        System.out.println("bop inter-->");
//        OperationBinding operationBinding =
//            executeOperation("Commit");
        //setoutsublineIs();
//        operationBinding.execute();
//        System.out.println("bop commit-->");
//        OperationBinding operationBinding1 =
//            executeOperation("setSizeWherCaluseBPO");
//        operationBinding1.execute();
        
//        BindingContext bindingContext = BindingContext.getCurrent();
//        DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//        ApplicationModule am = dc.getApplicationModule();
//        ViewObject vo =am.findViewObject("FillBPOsCriteria1");
        //vo.executeQuery();
        
        
        ViewObject vo =am.getFillBPOsCriteria1();
        vo.executeQuery();
        
        
        
    }
   
    
    ////////////////////////////////////////////////////////////////
//    public void editPopupFetchSize(PopupFetchEvent popupFetchEvent) {
//        System.out.println("size inter-->");
//        OperationBinding operationBinding =
//            executeOperation("Commit");
//        operationBinding.execute();
//        System.out.println("after sive commit-->");
//        OperationBinding operationBinding1 =
//            executeOperation("setSizeWherCaluse");
//        operationBinding1.execute();
//        //setSizeWherCaluse
//    }

    public void editDialogListener(DialogEvent dialogEvent) {

        System.out.println("editDialogListener enter ----------->");
        if (dialogEvent.getOutcome().name().equals("ok")) {
           
            BindingContext bctx = BindingContext.getCurrent();
            BindingContainer bindings = bctx.getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("FillLines");
            //invoke method
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
   // AdfFacesContext.getCurrentInstance().addPartialTarget(testTable);
//        setoutsublineIs();
//            AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
//            BindingContext bindingContext = BindingContext.getCurrent();
//            DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//            ApplicationModule am = dc.getApplicationModule();
//            ViewObject vo =am.findViewObject("LineVO1");
//            vo.executeQuery();
        }
    }


    public void editPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {

    }

    
    
    

    public String completion() {
        String userId = null, orgID = null, respId = null, RespApplId = null;
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("completion");
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        userId = (String)sessionScope.get("userId");
        orgID = (String)sessionScope.get("orgId");
        respId = (String)sessionScope.get("respId");

        operationBinding.getParamsMap().put("headerId",
                                            getHeaderId().getValue());


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed!";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }

    public String post() {
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("callPost");


        operationBinding.getParamsMap().put("headerId",
                                            getHeaderId().getValue());


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
           
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue =  
        operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed!";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }


    public void setCustomerIdS(RichInputText id) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("CustomerIdS", id.getValue());
    }

    public void setSaleOrderIdS(RichInputText id) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("orderHeaderIdS", id.getValue());
    }

    public void setHeaderIdS(RichInputText id) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("HeaderIdNEW", id.getValue());
        System.out.println("Session header id-->"+headerId.getValue());
    }

    public void setHeaderId(RichInputText headerId) {
        this.headerId = headerId;
        setHeaderIdS(headerId);
    }

    public RichInputText getHeaderId() {
        return headerId;
    }


    public void setCustomerBuyerID(RichInputText customerBuyerID) {
        this.customerBuyerID = customerBuyerID;
        setCustomerIdS(customerBuyerID);
    }

    public RichInputText getCustomerBuyerID() {
        return customerBuyerID;
    }


    public void setSaleOrderHeaderID(RichInputText saleOrderHeaderID) {
        this.saleOrderHeaderID = saleOrderHeaderID;
        setSaleOrderIdS(saleOrderHeaderID);
    }

    public RichInputText getSaleOrderHeaderID() {
        return saleOrderHeaderID;
    }

    public void setPrvLineoutput(RichInputText prvLineoutput) {
        this.prvLineoutput = prvLineoutput;
    }

    public RichInputText getPrvLineoutput() {
        return prvLineoutput;
    }

    public void setBalanceOutput(RichInputText balanceOutput) {
        this.balanceOutput = balanceOutput;
    }

    public RichInputText getBalanceOutput() {
        return balanceOutput;
    }

    public void setBalanceQty(RichInputText balanceQty) {
        this.balanceQty = balanceQty;
    }

    public RichInputText getBalanceQty() {
        return balanceQty;
    }


    public void setRatioPlanTable(RichTable ratioPlanTable) {
        this.ratioPlanTable = ratioPlanTable;
    }

    public RichTable getRatioPlanTable() {
        return ratioPlanTable;
    }

    ///////////////////////

//    public void setLineValues(String column, double value) {
//
//        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
//        // Get the Selected Row key set iterator
//        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
//        double CutQty = 0.0;
//        // TotalInput = 0.0;
//        while (selectionIt.hasNext()) {
//            Object rowKey = selectionIt.next();
//            table.setRowKey(rowKey);
//            int index = table.getRowIndex();
//            FacesCtrlHierNodeBinding row =
//                (FacesCtrlHierNodeBinding)table.getRowData(index);
//            Row selectedRow = row.getRow();
//            try {
//                selectedRow.setAttribute(column, value);
//            } catch (Exception e) {
//                ;
//            }
//        }
//         //AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
//
//    }
             public double getTotalValue() {

             BindingContext bindingContext = BindingContext.getCurrent();
             DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
             ApplicationModule am = dc.getApplicationModule();
             ViewObject findViewObject =am.findViewObject("DetailVO1");//ImpSaleContractDetailEOView1
             
             RowSetIterator it = findViewObject.createRowSetIterator("tt");
             double val = 0.0, total = 0.0;
             while (it.hasNext()){

                     Row r = it.next();
                     try {
                             val = Double.parseDouble(r.getAttribute("TotalInput").toString());
                     }catch (Exception e ){;}
                     
                     total = total + val ;
             } //end of while loop
             it.closeRowSetIterator();
             return total ; 
         } 
    
        public void setLineValues(String column, double value) {

        oracle.adf.view.rich.component.UIXTable table = getOffStandardLineTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double CutQty = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            try {
                selectedRow.setAttribute(column, value);
               // System.out.println("total_sam bean usman---->"+val);
            } catch (Exception e) {
                ;
            }
        }
         AdfFacesContext.getCurrentInstance().addPartialTarget(offStandardLineTable);

    }

    public void prodQtyAction(ValueChangeEvent valueChangeEvent) {

        double val = 0.00;
        try {
            val =Double.parseDouble(valueChangeEvent.getNewValue().toString());

        } catch (Exception e) {
            ;
        }

        double t = getDetValueSum("TotalStandad",val);
       // double tt = getDetValueSum("TotalInput",val);
        System.out.println("T Value in method action ----------->"+t);
        setLineValues("TotalStandad",t);
        //save();
    }
//    public void prodQtyAction1(ValueChangeEvent valueChangeEvent) {
//
//        double val = 0.00;
//        try {
//            val =Double.parseDouble(valueChangeEvent.getNewValue().toString());
//
//        } catch (Exception e) {
//            ;
//        }
//
//        double t = getDetValueSum("Rejection",val);
//        System.out.println("T Value in method action ----------->"+t);
//        setLineValues("DayRejection",t);
//        save();
//    }
//    public void prodQtyAction2(ValueChangeEvent valueChangeEvent) {
//
//        double val = 0.00;
//        try {
//            val =Double.parseDouble(valueChangeEvent.getNewValue().toString());
//
//        } catch (Exception e) {
//            ;
//        }
//
//        double t = getDetValueSum("TotalInput",val);
//        System.out.println("T Value in method action ----------->"+t);
//        setLineValues("TotalInput",t);
//        save();
//    }
    public double getDetValueSum(String column , double currentVal) {

        System.out.println("Method called ======================>");
        RowSetIterator it = OffStandard.createRowSetIterator("tt");
        Row currentRow = OffStandard.getCurrentRow();
     
        double total = 0.0, a = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            System.out.println("Total vaue initail --->"+total);
            if (r == currentRow) {
                total = total + currentVal;    
                System.out.println("Current row loop--- >"+total);
                continue;
            }

            try {
                a = Double.parseDouble(r.getAttribute(column).toString());
                System.out.println("Row count a ---->"+a);
                
            } catch (Exception e) {

                continue;
            }

            total = total + a;
            System.out.println("Total in while looop---->"+total);
        }        
        it.closeRowSetIterator();
        System.out.println("total return from method "+total);
        return total;


    }

//    public double getDetValueSum(String column , double currentVal) {
//
//        System.out.println("Method called ======================>");
//        RowSetIterator it = layPlanViewObject.createRowSetIterator("tt");
//        Row currentRow = layPlanViewObject.getCurrentRow();
//     
//        double total = 0.0, a = 0.0;
//        while (it.hasNext()) {
//            Row r = it.next();
//            System.out.println("Total vaue initail --->"+total);
//            if (r == currentRow) {
//                total = total + currentVal;    
//                System.out.println("Current row loop--- >"+total);
//                continue;
//            }
//
//            try {
//                a = Double.parseDouble(r.getAttribute(column).toString());
//                System.out.println("Row count a ---->"+a);
//                
//            } catch (Exception e) {
//
//                continue;
//            }
//
//            total = total + a;
//            System.out.println("Total in while looop---->"+total);
//        }        
//        it.closeRowSetIterator();
//        System.out.println("total return from method "+total);
//        return total;
//
//
//    }
    
//////////////////////////////////////
        public double getDetValueSumNew() {

        System.out.println("Method called ======================>");
        RowSetIterator it = layPlanViewObject.createRowSetIterator("tt");
        Row currentRow = layPlanViewObject.getCurrentRow();
     
        double total = 0.0, a = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            System.out.println("Total vaue initail --->"+total);
//            if (r == currentRow) {
//                total = total +;    
//                System.out.println("Current row loop--- >"+total);
//                continue;
//            }

            try {
                a = Double.parseDouble(r.getAttribute("TotalInput").toString());
                System.out.println("Row count a ---->"+a);
                
            } catch (Exception e) {

                continue;
            }

            total = total + a;
            System.out.println("Total in while looop---->"+total);
        }        
        it.closeRowSetIterator();
        System.out.println("total return from method "+total);
        return total;


    }


    //////////////////////

    public void setStn(RichInputListOfValues stn) {
        this.stn = stn;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("stn", stn.getValue());
    }

    public RichInputListOfValues getStn() {
        return stn;
    }

    public void setStyle(RichInputListOfValues style) {
        this.style = style;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("style", style.getValue());
        System.out.println("Session style-->"+style.getValue());
    }

    public RichInputListOfValues getStyle() {
        return style;
    }


    public void rejecDetAction(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        double val = 0.00;
        try {
            val =Double.parseDouble(valueChangeEvent.getNewValue().toString());

        } catch (Exception e) {
            ;
        }
        double rejTotal = getDetValueSum("Rejection", val);
        System.out.println("Value rejection --->"+rejTotal);
        setLineValues("DayRejection", rejTotal);
        setLineValues("TotRejection", rejTotal);
    }
    
    /**
     * Size pop up Coding 
     *      * 
     * ***************************************************************************************/
    
    public void editDialogSize(DialogEvent dialogEvent) {
           if (dialogEvent.getOutcome().name().equals("ok")) {

               OperationBinding operationBinding =
                   executeOperation("FillSizes");
               operationBinding.execute();
               AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
              // AdfFacesContext.getCurrentInstance().addPartialTarget(testTable);
               setoutsublineIs();
               AdfFacesContext.getCurrentInstance().addPartialTarget(sizeTable);
               BindingContext bindingContext = BindingContext.getCurrent();
               DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
               ApplicationModule am = dc.getApplicationModule();
               ViewObject vo =am.findViewObject("DetailVO1");
               vo.executeQuery();
               AdfFacesContext.getCurrentInstance().addPartialTarget(sizeTable);
            
               get_sam();
              
           }
           }

/*** get sam ***/

 /***function to get sam ****/
  public void get_sam(){
      String system_id = null;
      ViewObject vo=am.getLineVO1();
      try { system_id=vo.getCurrentRow().getAttribute("SystemId").toString();}
      catch (Exception e) {
              system_id = null;
              System.out.println("i am in get sm main");
          }
          
     

       
           
                BigDecimal   a =
                 (BigDecimal)callStoredFunction(NUMBER, "FIND_STITCH_LINEOUTPUT_LSTSAM(?)",
                                                new Object[] { Integer.parseInt(system_id)});
    /*  }
      catch (Exception e) {
                 e.printStackTrace();
                 
             }
      */
     String value=null;
      value=a.toString();
      ViewObject vo1 = am.getLineVO1();
      try {
          vo1.getCurrentRow().setAttribute("SamValue", value);
          }
      catch (Exception e){e.printStackTrace();}
    

  }
    
 /***call store functiin**/
  protected Object callStoredFunction(int sqlReturnType, String stmt,
                                      Object[] bindVars) {
      CallableStatement st = null;
      try {
          // 1. Create a JDBC CallabledStatement
          st =
  am.getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
          // 2. Register the first bind variable for the return value
          st.registerOutParameter(1, sqlReturnType);
          if (bindVars != null) {
              // 3. Loop over values for the bind variables passed in, if any
              for (int z = 0; z < bindVars.length; z++) {
                  // 4. Set the value of user-supplied bind vars in the stmt
                  st.setObject(z + 2, bindVars[z]);
                  
              }
          }
          // 5. Set the value of user-supplied bind vars in the stmt
          st.executeUpdate();
          // 6. Return the value of the first bind variable
          return st.getObject(1);

      } catch (SQLException e) {
          throw new JboException(e);
      } finally {
          if (st != null) {
              try {
                  // 7. Close the statement
                  st.close();
              } catch (SQLException e) {
              }
          }
      }

  }


       public void editPopupFetchSize(PopupFetchEvent popupFetchEvent) {
           System.out.println("size inter-->");
           OperationBinding operationBinding =
               executeOperation("Commit");
          setoutsublineIs();
          AdfFacesContext.getCurrentInstance().addPartialTarget(sizeTable);
          AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
//           BindingContext bindingContext = BindingContext.getCurrent();
//           DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//           ApplicationModule am = dc.getApplicationModule();
//           ViewObject vo =am.findViewObject("LineVO1");
//           operationBinding.execute();
//           BindingContext bindingContext1 = BindingContext.getCurrent();
//           DCDataControl dc1 =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//           ApplicationModule am1 = dc.getApplicationModule();
//           ViewObject vo1 =am.findViewObject("SizeLOV1");
//           vo.executeQuery();
           System.out.println("after sive commit-->");
           OperationBinding operationBinding1 =
               executeOperation("setSizeWherCaluse");
           operationBinding1.execute();
           if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
           
                        BindingContainer bindings = getBindings();
                        OperationBinding operationBinding2 =
                            bindings.getOperationBinding("CreateInsert");
                        operationBinding2.execute();
                    }
           //setSizeWherCaluse
       }
//        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
//
//             BindingContainer bindings = getBindings();
//             OperationBinding operationBinding =
//                 bindings.getOperationBinding("CreateInsert");
//             operationBinding.execute();
//         }
    
    
    
    /********************************************************************************************************/
    
    /*****Generic Method to Get BindingContainer**/
       public BindingContainer getBindingsCont() {
           return BindingContext.getCurrent().getCurrentBindingsEntry();
       }

       /**
        * Generic Method to execute operation
        * */
       public OperationBinding executeOperation(String operation) {
           OperationBinding createParam =
               getBindingsCont().getOperationBinding(operation);
           return createParam;

       }


    public void setTestTable(RichTable testTable) {
        this.testTable = testTable;
    }

    public RichTable getTestTable() {
        return testTable;
    }

    public void setSize(RichTable size) {
        this.size = size;
    }

    public RichTable getSize() {
        return size;
    }

    public void setSizeTable(RichTable sizeTable) {
        this.sizeTable = sizeTable;
    }

    public RichTable getSizeTable() {
        return sizeTable;
    }

    public String cb11_action() throws IOException {
        // Add event code here...

            // Add event code here...
            FacesContext fc = FacesContext.getCurrentInstance();
            HttpServletResponse response = (HttpServletResponse)fc.getExternalContext().getResponse();
            response.sendRedirect("/TestRegions-ViewController-context-root/faces/pageWithFragments.jspx?headerId="+10);
            fc.responseComplete();
            
               
        
        return null;
    }

    public void setTotalProduetion(RichOutputText totalProduetion) {
        this.totalProduetion = totalProduetion;
    }

    public RichOutputText getTotalProduetion() {
        return totalProduetion;
    }

    public void setTotRejection(RichInputText totRejection) {
        this.totRejection = totRejection;
    }

    public RichInputText getTotRejection() {
        return totRejection;
    }

    public void setWip(RichInputText wip) {
        this.wip = wip;
    }

    public RichInputText getWip() {
        return wip;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    ///////////Code To Get Total ***********************
//         public double getTotalValue() {
//
//             BindingContext bindingContext = BindingContext.getCurrent();
//             DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//             ApplicationModule am = dc.getApplicationModule();
//             ViewObject findViewObject =am.findViewObject("DetailVO1");//ImpSaleContractDetailEOView1
//             
//             RowSetIterator it = findViewObject.createRowSetIterator("tt");
//             double val = 0.0, total = 0.0;
//             while (it.hasNext()){
//
//                     Row r = it.next();
//                     try {
//                             val = Double.parseDouble(r.getAttribute("TotalInput").toString());
//                     }catch (Exception e ){;}
//                     
//                     total = total + val ;
//             } //end of while loop
//             it.closeRowSetIterator();
//             return total ; 
//         } 
//    
 /// Code to Set Total 
        public void setLineValueTotal(double val) {

            oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
            // Get the Selected Row key set iterator
            java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
            double ply = 0.0;
            while (selectionIt.hasNext()) {
                Object rowKey = selectionIt.next();
                table.setRowKey(rowKey);
                int index = table.getRowIndex();
                FacesCtrlHierNodeBinding row =
                    (FacesCtrlHierNodeBinding)table.getRowData(index);
                Row selectedRow = row.getRow();


                
                    selectedRow.setAttribute("TotalInput",val);
               

            }
            
        }
/////////////////////////////////////
                 public double getTotalValueLine() {

             BindingContext bindingContext = BindingContext.getCurrent();
             DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
             ApplicationModule am = dc.getApplicationModule();
             ViewObject findViewObject =am.findViewObject("LineVO1");//ImpSaleContractDetailEOView1
             
            RowSetIterator it = findViewObject.createRowSetIterator("tt");
            double val = 0.0, total = 0.0;
            while (it.hasNext()){

                     Row r = it.next();
                     try {
                             val = Double.parseDouble(r.getAttribute("LineOutput").toString());
                     }catch (Exception e ){;}
                     
                    total = total + val ;
             } //end of while loop
             it.closeRowSetIterator();
             return total ; 
         } 
    public void setTotalValueLine(double val) {

        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            System.out.println("setTotalValueLine --->"+val);
          // total_prod(); 
            System.out.println("inter total_prod --->");
               // selectedRow.setAttribute("TotalProduetion",val);
           
            System.out.println("setTotalValueLine setTotalValueLine 2 --->"+val);
        }
        
    }

        ////////////////////////////////////
        /////////////////////////////////////
                         public double getTotalRegection() {

                     BindingContext bindingContext = BindingContext.getCurrent();
                     DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
                     ApplicationModule am = dc.getApplicationModule();
                     ViewObject findViewObject =am.findViewObject("LineVO1");//ImpSaleContractDetailEOView1
                     
                    RowSetIterator it = findViewObject.createRowSetIterator("tt");
                    double val = 0.0, total = 0.0;
                    while (it.hasNext()){

                             Row r = it.next();
                             try {
                                     val = Double.parseDouble(r.getAttribute("TotRejection").toString());
                             }catch (Exception e ){;}
                             
                            total = total + val ;
                     } //end of while loop
                     it.closeRowSetIterator();
                     return total ; 
                 } 
            public void setTotalRejectionLine(double val) {

                oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
                // Get the Selected Row key set iterator
                java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
                double ply = 0.0;
                while (selectionIt.hasNext()) {
                    Object rowKey = selectionIt.next();
                    table.setRowKey(rowKey);
                    int index = table.getRowIndex();
                    FacesCtrlHierNodeBinding row =
                        (FacesCtrlHierNodeBinding)table.getRowData(index);
                    Row selectedRow = row.getRow();
                    System.out.println("setTotalValueLine --->"+val);
                   total_Rejection(); 
                    System.out.println("inter total_prod --->");
                       // selectedRow.setAttribute("TotalProduetion",val);
                   
                    System.out.println("setTotalRejectionLine setTotalValueLine 2 --->"+val);
                }
                
            }

                ////////////////////////////////////
                /////////////////////////////////////
//                                 public double getTotalValueDetail() {
//
//                             BindingContext bindingContext = BindingContext.getCurrent();
//                             DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//                             ApplicationModule am = dc.getApplicationModule();
//                             ViewObject findViewObject =am.findViewObject("DetailVO1");//ImpSaleContractDetailEOView1
//                             
//                            RowSetIterator it = findViewObject.createRowSetIterator("tt");
//                            double val = 0.0, total = 0.0;
//                            while (it.hasNext()){
//
//                                     Row r = it.next();
//                                     try {
//                                             val = Double.parseDouble(r.getAttribute("Cutqty").toString());
//                                     }catch (Exception e ){;}
//                                     
//                                    total = total + val ;
//                             } //end of while loop
//                             it.closeRowSetIterator();
//                             return total ; 
//                         } 
//                    public void setTotalValueDetail(double val) {
//
//                        oracle.adf.view.rich.component.UIXTable table = getSizeTable();
//                        // Get the Selected Row key set iterator
//                        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
//                        double ply = 0.0;
//                        while (selectionIt.hasNext()) {
//                            Object rowKey = selectionIt.next();
//                            table.setRowKey(rowKey);
//                            int index = table.getRowIndex();
//                            FacesCtrlHierNodeBinding row =
//                                (FacesCtrlHierNodeBinding)table.getRowData(index);
//                            Row selectedRow = row.getRow();
//                            System.out.println("setTotalValueLine --->"+val);
//                           total_prodDetail(); 
//                            System.out.println("inter total_prod --->");
//                               // selectedRow.setAttribute("TotalProduetion",val);
//                           
//                            System.out.println("setTotalValueLine 2 --->"+val);
//                        }
//                        
//                    }

                        ////////////////////////////////////
                        /////////////////////////////////////
                                         public double getTotalValueRejDetail() {

                                     BindingContext bindingContext = BindingContext.getCurrent();
                                     DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
                                     ApplicationModule am = dc.getApplicationModule();
                                     ViewObject findViewObject =am.findViewObject("DetailVO1");//ImpSaleContractDetailEOView1
                                     
                                    RowSetIterator it = findViewObject.createRowSetIterator("tt");
                                    double val = 0.0, total = 0.0;
                                    while (it.hasNext()){

                                             Row r = it.next();
                                             try {
                                                     val = Double.parseDouble(r.getAttribute("Rejection").toString());
                                             }catch (Exception e ){;}
                                             
                                            total = total + val ;
                                     } //end of while loop
                                     it.closeRowSetIterator();
                                     return total ; 
                                 } 
                            public void setTotalRejValueDetail(double val) {

                                oracle.adf.view.rich.component.UIXTable table = getSizeTable();
                                // Get the Selected Row key set iterator
                                java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
                                double ply = 0.0;
                                while (selectionIt.hasNext()) {
                                    Object rowKey = selectionIt.next();
                                    table.setRowKey(rowKey);
                                    int index = table.getRowIndex();
                                    FacesCtrlHierNodeBinding row =
                                        (FacesCtrlHierNodeBinding)table.getRowData(index);
                                    Row selectedRow = row.getRow();
                                    System.out.println("setTotalValueLine --->"+val);
                                   total_RejectionDetail(); 
                                    System.out.println("inter total_prod --->");
                                       // selectedRow.setAttribute("TotalProduetion",val);
                                   
                                    System.out.println("setTotalRejValueDetail setTotalValueLine 2 --->"+val);
                                }
                                
                            }

                                ////////////////////////////////////
                                /////////////////////////////////////
//                                                 public double getTotalWIP() {
//
//                                             BindingContext bindingContext = BindingContext.getCurrent();
//                                             DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//                                             ApplicationModule am = dc.getApplicationModule();
//                                             ViewObject findViewObject =am.findViewObject("LineVO1");//ImpSaleContractDetailEOView1
//                                             
//                                            RowSetIterator it = findViewObject.createRowSetIterator("tt");
//                                            double val = 0.0, total = 0.0,vall = 0.0,valll = 0.0; 
//                                           // while (it.hasNext())
//                                            {
//
//                                                     Row r = it.next();
//                                                     try {
//                                                             val = Double.parseDouble(r.getAttribute("TotalInput").toString());
//                                                         System.out.println("TotalInput value --->"+val);
//                                                     }catch (Exception e ){;}
//                                                 try {
//                                                         vall = Double.parseDouble(r.getAttribute("TotalProduetion").toString());
//                                                     System.out.println("TotalProduetion value --->"+vall);
//                                                 }catch (Exception e ){;}
//                                                 try {
//                                                         valll = Double.parseDouble(r.getAttribute("TotRejection").toString());
//                                                     System.out.println("TotRejection value --->"+valll);
//                                                 }catch (Exception e ){;}
//                                                     
//                                                    total =  val - vall - valll ;
//                                                 System.out.println("Total wip in line usman --->"+total);
//                                             } //end of while loop
//                                             it.closeRowSetIterator();
//                                             System.out.println("Total wip in line usman exactly upar--->"+total);
//                                             return total ; 
//                                         } 
//                                    public void setTotalWIP(double total ) {
//
//                                        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
//                                        // Get the Selected Row key set iterator
//                                        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
//                                        double ply = 0.0;
//                                        while (selectionIt.hasNext()) {
//                                            Object rowKey = selectionIt.next();
//                                            table.setRowKey(rowKey);
//                                            int index = table.getRowIndex();
//                                            FacesCtrlHierNodeBinding row =
//                                                (FacesCtrlHierNodeBinding)table.getRowData(index);
//                                            Row selectedRow = row.getRow();
//                                            System.out.println("setTotalValueLine wip line level --->"+total);
//                                          // total_prod(); 
//                                            System.out.println("inter total_prod wip --->");
//                                             selectedRow.setAttribute("Wip",total);
//                                           
//                                            System.out.println("setTotalValueLine wip line level--->"+total);
//                                        }
//                                        
//                                    }
//
//                                        ////////////////////////////////////
//                                        /////////////////////////////////////
//                                                         public double getTotalWIPDetail() {
//
//                                                     BindingContext bindingContext = BindingContext.getCurrent();
//                                                     DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//                                                     ApplicationModule am = dc.getApplicationModule();
//                                                     ViewObject findViewObject =am.findViewObject("DetailVO1");//ImpSaleContractDetailEOView1
//                                                     
//                                                    RowSetIterator it = findViewObject.createRowSetIterator("tt");
//                                                    double val = 0.0, total = 0.0,vall = 0.0,valll = 0.0; 
//                                                   // while (it.hasNext())
//                                                    {
//
//                                                             Row r = it.next();
//                                                             try {
//                                                                     val = Double.parseDouble(r.getAttribute("TotalInput").toString());
//                                                                 System.out.println("TotalInput value --->"+val);
//                                                             }catch (Exception e ){;}
//                                                         try {
//                                                                 vall = Double.parseDouble(r.getAttribute("TotalProduction").toString());
//                                                             System.out.println("TotalProduetion value --->"+vall);
//                                                         }catch (Exception e ){;}
//                                                         try {
//                                                                 valll = Double.parseDouble(r.getAttribute("TotalRejection").toString());
//                                                             System.out.println("TotRejection value --->"+valll);
//                                                         }catch (Exception e ){;}
//                                                             
//                                                            total =  val - vall - valll ;
//                                                     } //end of while loop
//                                                     it.closeRowSetIterator();
//                                                     return total ; 
//                                                 } 
//                                            public void setTotalWIPDetail(double total ) {
//
//                                                oracle.adf.view.rich.component.UIXTable table = getSizeTable();
//                                                // Get the Selected Row key set iterator
//                                                java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
//                                                double ply = 0.0;
//                                                while (selectionIt.hasNext()) {
//                                                    Object rowKey = selectionIt.next();
//                                                    table.setRowKey(rowKey);
//                                                    int index = table.getRowIndex();
//                                                    FacesCtrlHierNodeBinding row =
//                                                        (FacesCtrlHierNodeBinding)table.getRowData(index);
//                                                    Row selectedRow = row.getRow();
//                                                    System.out.println("setTotalValueLine wip --->"+total);
//                                                  // total_prod(); 
//                                                    System.out.println("inter total_prod wip --->");
//                                                     selectedRow.setAttribute("Wip",total);
//                                                   
//                                                    System.out.println("setTotalValueLine 2  wip--->"+total);
//                                                }
//                                                
//                                            }

                                                ////////////////////////////////////

    public String total_prod(int loopvar) {
        System.out.println("enter in total_prod -->  "+loopvar);
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("CalculateTotalProductionNewLINE");
        operationBinding.getParamsMap().put("headerId",
                                            getHeaderId().getValue());
        System.out.println("Header id -->" + headerId.getValue().toString());
        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->"); 
            }
        
        if (loopvar == 1)
        {
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null)
        
        
        {
            message = methodReturnValue.toString();
            System.out.println("message  in bean -->"+message); 
        } else {
           message = "Record has been saved Successfully";
            System.out.println("if errors 3-->"+message); 
        }
        if(message.contains("OK")==false)
        {
            System.out.println("if errors 4-->"+message); 
            FacesMessage fm = new FacesMessage(message);
            fm.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, fm);
            System.out.println("if errors 4-->");     
        }
        }
        return null;
        
    }

    public String save() {
     for(int a=0 ; a <=1 ; a++)
       {
        Save();
           double x=getTotalProduction();
           System.out.println("Level 1 BEAN  "+x);
           System.out.println("Level 1 BEAN");
           // samStitch.setValue(getSAMTotalQty());
           try {
              totalProductionHeader.setValue(new oracle.jbo.domain.Number(x));
           } catch (SQLException e) {
           }
           Save();
           double xx=gettotalStandardMinutesHeader();
           // samStitch.setValue(getSAMTotalQty());
           ViewObject headervo= am.getHederVO1();
           headervo.getCurrentRow().setAttribute("TlStandardMin", xx);
          
           try {
              totalStandardMinutesH.setValue(new oracle.jbo.domain.Number(xx));
           } catch (SQLException e) {
           }
        total_prod(a);
         Total_Attended_Minutes();
//           BindingContext bindingContext = BindingContext.getCurrent();
//              DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
//             ApplicationModule am = dc.getApplicationModule();
//          ViewObject vo =am.findViewObject("HederVO1");
//                  operationBinding.execute();
           BindingContext bindingContext = BindingContext.getCurrent();
           DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
           ApplicationModule am = dc.getApplicationModule();
           ViewObject vo =am.findViewObject("HederVO1");
           //vo.executeQuery();


           AdfFacesContext.getCurrentInstance().addPartialTarget(sizeTable);                                                
           AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
           AdfFacesContext.getCurrentInstance().addPartialTarget(totalProductionHeader);   
           //AdfFacesContext.getCurrentInstance().addPartialTarget(totalProduceMinutes);
         
         efficencyCalculation();
           total_produced_min();
        Save();
           
       }
       return null;
   
    }
    
    public void Save(){
        
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        }

    public void setTotalInputdetail(RichInputText totalInputdetail) {
        this.totalInputdetail = totalInputdetail;
    }

    public RichInputText getTotalInputdetail() {
        return totalInputdetail;
    }

    public void setTotalInputLine(RichOutputText totalInputLine) {
        this.totalInputLine = totalInputLine;
    }

    public RichOutputText getTotalInputLine() {
        return totalInputLine;
    }
//////////////////////////////TITAL PRODUCTION NEW///////
//            public String total_prod() {
//        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
//                 
//         java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
//         
//         while (selectionIt.hasNext()) {
//                     Object rowKey = selectionIt.next();
//                     table.setRowKey(rowKey);
//                 
//         int index = table.getRowIndex();
//         
//         FacesCtrlHierNodeBinding row =(FacesCtrlHierNodeBinding)table.getRowData(index);
//         Row selectedRow = row.getRow();
//         String v_Proposal=selectedRow.getAttribute("ProdTransId").toString();
////        oracle.adf.view.rich.component.UIXTable table1 = getSizeTable();
////                 
////         java.util.Iterator selectionIt1 = table1.getSelectedRowKeys().iterator();
////         
////         while (selectionIt1.hasNext()) {
////                     Object rowKey1 = selectionIt1.next();
////                     table.setRowKey(rowKey);
////                 
////         int index1 = table.getRowIndex();
////         
////         FacesCtrlHierNodeBinding row1 =(FacesCtrlHierNodeBinding)table1.getRowData(index);
////         Row selectedRow1 = row1.getRow();
////         String v_Proposal_1=selectedRow1.getAttribute("SizeVal").toString();
//             
//        BindingContext bctx = BindingContext.getCurrent();
//        BindingContainer bindings = bctx.getCurrentBindingsEntry();
//        OperationBinding operationBinding =
//            bindings.getOperationBinding("sumtotalProduction");
//
//
//        operationBinding.getParamsMap().put("ProdTransId",
//                                            v_Proposal);
//        System.out.println("get line id Line level--->"+ v_Proposal );
//        
////        operationBinding.getParamsMap().put("SizeVal",
////                                            v_Proposal_1);
////        System.out.println("get sive id--->"+  v_Proposal_1);
//
//
//        //invoke method
//        operationBinding.execute();
//        if (!operationBinding.getErrors().isEmpty()) {
//            System.out.println("if errors-->");
//            // List errors = operationBinding.getErrors();
//        }
//        //optional
////        Object methodReturnValue = operationBinding.getResult();
////        String message = null;
////        if (methodReturnValue != null) {
////            message = methodReturnValue.toString();
////        } else {
////            message = "Failed!";
////        }
////        FacesMessage fm = new FacesMessage(message);
////        fm.setSeverity(FacesMessage.SEVERITY_INFO);
////        FacesContext context = FacesContext.getCurrentInstance();
////        context.addMessage(null, fm);
//       
//    }
//              return null; 
//          }
    //////////////////////////
    //////////////////////////////TITAL PRODUCTION NEW WIP CALCULATION///////
                public String total_prod_WIP() {
            oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
                     
             java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
             
             while (selectionIt.hasNext()) {
                         Object rowKey = selectionIt.next();
                         table.setRowKey(rowKey);
                     
             int index = table.getRowIndex();
             
             FacesCtrlHierNodeBinding row =(FacesCtrlHierNodeBinding)table.getRowData(index);
             Row selectedRow = row.getRow();
             String v_Proposal=selectedRow.getAttribute("ProdTransId").toString();
            BindingContext bctx = BindingContext.getCurrent();
            BindingContainer bindings = bctx.getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding("sumtotalProductionWIPLINE");
            operationBinding.getParamsMap().put("ProdTransId",
                                                v_Proposal);
            System.out.println("get line id Line level--->"+ v_Proposal );
            
            operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
                System.out.println("if errors-->");
            }        
        }
                  return null; 
              }
        //////////////////////////TOTAL WIP CALCULATE IN Detail LEVEL///////////////
        public String total_prod_WIP_Detail() {
              System.out.println("enter in total_prodDetail in bean--->");
            
        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
                 
         java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
         
         while (selectionIt.hasNext()) {
                     Object rowKey = selectionIt.next();
                     table.setRowKey(rowKey);
                 
         int index = table.getRowIndex();
         
         FacesCtrlHierNodeBinding row =(FacesCtrlHierNodeBinding)table.getRowData(index);
         Row selectedRow = row.getRow();
         String v_Proposal=selectedRow.getAttribute("OutSublineId").toString();
              System.out.println("enter in total_prodDetail in bean out sub lin id --->"+v_Proposal);
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("sumtotalprodetailWIP");


        operationBinding.getParamsMap().put("OutSublineId",
                                            v_Proposal);
        System.out.println("get line id--->"+ v_Proposal );
        
        operationBinding.getParamsMap().put("SizeVal",
                                            1);
        System.out.println("get sive id--->"+  1);
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
        }    
        }
          
          return null;}
        ////////////////////////////////
//    public  void total_prod(){
//        
//            System.out.println("Charge Detail ID-------->");                    
//                    OperationBinding operationBinding = executeOperation("sumtotalProduction");        
//                  System.out.println("Charge Detail ID 2-------->");   
//                       // operationBinding.getParamsMap().put("ChrgDetId",557);     
//                         operationBinding.execute();   
//        
//        }
            
            ///////TOTAL REG NEW/
            public String total_Rejection() {
            oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
                 
            java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
            
            while (selectionIt.hasNext()) {
                     Object rowKey = selectionIt.next();
                     table.setRowKey(rowKey);
                 
            int index = table.getRowIndex();
            
            FacesCtrlHierNodeBinding row =(FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            String v_Proposal=selectedRow.getAttribute("ProdTransId").toString();
            //        oracle.adf.view.rich.component.UIXTable table1 = getSizeTable();
            //
            //         java.util.Iterator selectionIt1 = table1.getSelectedRowKeys().iterator();
            //
            //         while (selectionIt1.hasNext()) {
            //                     Object rowKey1 = selectionIt1.next();
            //                     table.setRowKey(rowKey);
            //
            //         int index1 = table.getRowIndex();
            //
            //         FacesCtrlHierNodeBinding row1 =(FacesCtrlHierNodeBinding)table1.getRowData(index);
            //         Row selectedRow1 = row1.getRow();
            //         String v_Proposal_1=selectedRow1.getAttribute("SizeVal").toString();
             
            BindingContext bctx = BindingContext.getCurrent();
            BindingContainer bindings = bctx.getCurrentBindingsEntry();
            OperationBinding operationBinding =
            bindings.getOperationBinding("sumtotalRejection");


            operationBinding.getParamsMap().put("ProdTransId",
                                            v_Proposal);
            System.out.println("get line id Line level--->"+ v_Proposal );
            
            //        operationBinding.getParamsMap().put("SizeVal",
            //                                            v_Proposal_1);
            //        System.out.println("get sive id--->"+  v_Proposal_1);


            //invoke method
            operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
            }
            //optional
            //        Object methodReturnValue = operationBinding.getResult();
            //        String message = null;
            //        if (methodReturnValue != null) {
            //            message = methodReturnValue.toString();
            //        } else {
            //            message = "Failed!";
            //        }
            //        FacesMessage fm = new FacesMessage(message);
            //        fm.setSeverity(FacesMessage.SEVERITY_INFO);
            //        FacesContext context = FacesContext.getCurrentInstance();
            //        context.addMessage(null, fm);
            
            }
              return null; 
            }
            /////////////////////
//    public  void total_Rejection(){
//        
//            System.out.println("Charge Detail ID-------->");                    
//                    OperationBinding operationBinding = executeOperation("sumtotalRejection");        
//                  System.out.println("Charge Detail ID 2-------->");   
//                       // operationBinding.getParamsMap().put("ChrgDetId",557);     
//                         operationBinding.execute();   
//        
//        }
    
//    public  void total_prodDetail(){
//        
//            System.out.println("Charge Detail ID-------->");                    
//                    OperationBinding operationBinding = executeOperation("sumtotalprodetail");        
//                  System.out.println("Charge Detail ID 2-------->");   
//                       // operationBinding.getParamsMap().put("ChrgDetId",557);     
//                         operationBinding.execute();   
//        
//        }
    
        public String total_prodDetail() {
              System.out.println("enter in total_prodDetail in bean--->");
            
        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
                 
         java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
         
         while (selectionIt.hasNext()) {
                     Object rowKey = selectionIt.next();
                     table.setRowKey(rowKey);
                 
         int index = table.getRowIndex();
         
         FacesCtrlHierNodeBinding row =(FacesCtrlHierNodeBinding)table.getRowData(index);
         Row selectedRow = row.getRow();
         String v_Proposal=selectedRow.getAttribute("OutSublineId").toString();
              System.out.println("enter in total_prodDetail in bean out sub lin id --->"+v_Proposal);
//       oracle.adf.view.rich.component.UIXTable table1 = getSizeTable();
//                 
//        java.util.Iterator selectionIt1 = table1.getSelectedRowKeys().iterator();
//         
//         while (selectionIt1.hasNext()) {
//                     Object rowKey1 = selectionIt1.next();
//                     table.setRowKey(rowKey);
//                 
//         int index1 = table.getRowIndex();
//         
//         FacesCtrlHierNodeBinding row1 =(FacesCtrlHierNodeBinding)table1.getRowData(index);
//         Row selectedRow1 = row1.getRow();
//         String v_Proposal_1=selectedRow1.getAttribute("SizeVal").toString();
//             
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("sumtotalprodetail");


        operationBinding.getParamsMap().put("OutSublineId",
                                            v_Proposal);
        System.out.println("get line id--->"+ v_Proposal );
        
        operationBinding.getParamsMap().put("SizeVal",
                                            1);
        System.out.println("get sive id--->"+  1);


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
//        Object methodReturnValue = operationBinding.getResult();
//        String message = null;
//        if (methodReturnValue != null) {
//            message = methodReturnValue.toString();
//        } else {
//            message = "Failed!";
//        }
//        FacesMessage fm = new FacesMessage(message);
//        fm.setSeverity(FacesMessage.SEVERITY_INFO);
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.addMessage(null, fm);
       
    }
          
          return null;}
//    public  void total_RejectionDetail(){
//        
//            System.out.println("Charge Detail ID-------->");                    
//                    OperationBinding operationBinding = executeOperation("sumtotalRejectiondetail");        
//                  System.out.println("Charge Detail ID 2-------->");   
//                       // operationBinding.getParamsMap().put("ChrgDetId",557);     
//                         operationBinding.execute();   
//        
//        }
    public String total_RejectionDetail() {
    oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
             
     java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
     
     while (selectionIt.hasNext()) {
                 Object rowKey = selectionIt.next();
                 table.setRowKey(rowKey);
             
     int index = table.getRowIndex();
     
     FacesCtrlHierNodeBinding row =(FacesCtrlHierNodeBinding)table.getRowData(index);
     Row selectedRow = row.getRow();
     String v_Proposal=selectedRow.getAttribute("OutSublineId").toString();
//    oracle.adf.view.rich.component.UIXTable table1 = getSizeTable();
//             
//     java.util.Iterator selectionIt1 = table1.getSelectedRowKeys().iterator();
//     
//     while (selectionIt1.hasNext()) {
//                 Object rowKey1 = selectionIt1.next();
//                 table.setRowKey(rowKey);
//             
//     int index1 = table.getRowIndex();
//     
//     FacesCtrlHierNodeBinding row1 =(FacesCtrlHierNodeBinding)table1.getRowData(index);
//     Row selectedRow1 = row1.getRow();
//     String v_Proposal_1=selectedRow1.getAttribute("SizeVal").toString();
         
    BindingContext bctx = BindingContext.getCurrent();
    BindingContainer bindings = bctx.getCurrentBindingsEntry();
    OperationBinding operationBinding =
        bindings.getOperationBinding("sumtotalRejectiondetail");


    operationBinding.getParamsMap().put("OutSublineId",
                                        v_Proposal);
    System.out.println("get line id--->"+ v_Proposal );
    
    operationBinding.getParamsMap().put("SizeVal",
                                        1);
    System.out.println("get sive id--->"+  1);


    //invoke method
    operationBinding.execute();
    if (!operationBinding.getErrors().isEmpty()) {
        System.out.println("if errors-->");
        // List errors = operationBinding.getErrors();
    }
    //optional
    //        Object methodReturnValue = operationBinding.getResult();
    //        String message = null;
    //        if (methodReturnValue != null) {
    //            message = methodReturnValue.toString();
    //        } else {
    //            message = "Failed!";
    //        }
    //        FacesMessage fm = new FacesMessage(message);
    //        fm.setSeverity(FacesMessage.SEVERITY_INFO);
    //        FacesContext context = FacesContext.getCurrentInstance();
    //        context.addMessage(null, fm);
    
    }
      
      return null;}
    
    
    public Hashtable getValue() {
    Hashtable ht = new Hashtable ();
     BindingContext bindingContext = BindingContext.getCurrent();
    DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
    ApplicationModule am = dc.getApplicationModule();
    ViewObject findViewObject =am.findViewObject("LinesVO1");//ImpSaleContractDetailEOView1
    RowSetIterator it = findViewObject.createRowSetIterator("tt");
       double val = 0.0, total = 0.0 ,gtotal = 0.0; 
         double val1 = 0.0;
         double val1l = 0.0;
       // while (it.hasNext())
       // {
    
    // Row r = it.next();
               Row r = findViewObject.getCurrentRow();
                 
                try {
                         val = Double.parseDouble(r.getAttribute("TotalInput").toString());
                    
                    System.out.println("TotalInput --->"+val);
                                                                  
                   val1 = Double.parseDouble(r.getAttribute("TotalProduetion").toString());
                   
                    val1l = Double.parseDouble(r.getAttribute("TotRejection").toString());
                 
                    System.out.println("TotalProduetion --->"+val1);
               
                }
               catch (Exception e ){val = 0.0;}
             
    
              gtotal = val-val1-val1l;
         System.out.println("after minus--->"+gtotal);  
    
     return ht;
    
     }


    public void setLineID(RichInputText lineID) {
        this.lineID = lineID;
    }

    public RichInputText getLineID() {
        return lineID;
    }

    public void setSizeId(RichInputText sizeId) {
        this.sizeId = sizeId;
    }

    public RichInputText getSizeId() {
        return sizeId;
    }
    

    public void setAttributeSave(RichPanelLabelAndMessage attributeSave) {
        this.attributeSave = attributeSave;
        
        
    }

    public RichPanelLabelAndMessage getAttributeSave() {
        return attributeSave;
    }

//    public String DeleteDetail() {
//        System.out.println("enter in delet-->");
//
//        BindingContainer bindings = getBindings();
//        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
//        Object result = operationBinding.execute();
//        if (!operationBinding.getErrors().isEmpty()) {
//            total_prod();
//            
//            
//            return null;
//        }
//        return null;
//    }

    public String Delete() {
        //setTotalValueLine (getTotalValueLine());
        double val = 0.00;
       double t = getDetValueSum("Cutqty",val);
        double tt = getDetValueSum("TotalInput",val);
        System.out.println("T Value in method action ----------->"+t);
        setLineValues("LineOutput",t);
        
        double vall = 0.00;
        double ttt = getDetValueSum("Rejection",vall);
        System.out.println("T Value in method action ----------->"+t);
        setLineValues("DayRejection",ttt);
//        System.out.println("enter in delet ---->");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
           // AdfFacesContext.getCurrentInstance().addPartialTarget(samFinish);
            AdfFacesContext.getCurrentInstance().addPartialTarget(sizeTable);
            System.out.println("enter in delet 2 ---->");
            save();
            System.out.println("enter in delet 3---->");
            //AdfFacesContext.getCurrentInstance().addPartialTarget(samFinish);
            AdfFacesContext.getCurrentInstance().addPartialTarget(sizeTable);
            return null;
        }
        save();
        return null;
    }
    
//    public void setOutSublineIdS(RichInputText id) {
//
//        FacesContext fctx = FacesContext.getCurrentInstance();
//        ExternalContext ectx = fctx.getExternalContext();
//        HttpSession userSession = (HttpSession)ectx.getSession(false);
//        userSession.setAttribute("OutSublineIdS", id.getValue());
//    }

    public void setOutSublineId(RichColumn outSublineId) {
        this.outSublineId = outSublineId;
        
    
    }

    public RichColumn getOutSublineId() {
        return outSublineId;
    }
    
    
    public void setoutsublineIs() {

        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        int vall = 0 ;
        
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();

            System.out.println("outSublineId 1 ---->");
            
                vall=Integer.parseInt(selectedRow.getAttribute("OutSublineId").toString());
           
            System.out.println("outSublineId 2 get value ---->"+vall);
        }
//        FacesContext fctx = FacesContext.getCurrentInstance();
//                ExternalContext ectx = fctx.getExternalContext();
//                HttpSession userSession = (HttpSession)ectx.getSession(false);
//                userSession.setAttribute("usman", vall);
          /////////////////////////////////////////////////////////
          FacesContext fctx = FacesContext.getCurrentInstance();
          ExternalContext ectx = fctx.getExternalContext();
          HttpSession userSession = (HttpSession)ectx.getSession(false);
          userSession.setAttribute("OutSublineIdNew", vall);
         // System.out.println("OutSublineIdNew-->"+OutSublineIdNew.getValue());   
                
                ///////////////////////////////////////////
                System.out.println("outSublineId 2 set value ---->"+vall);
                
                
            }
    
        ////////////////////////////////////////new popup////////////////
            public void editPopupFetchNEW(PopupFetchEvent popupFetchEvent) {
                System.out.println("size inter-->");
                OperationBinding operationBinding =
                    executeOperation("Commit");
                System.out.println("after sive commit NEW-->");
                OperationBinding operationBinding1 =
                    executeOperation("setSizeWherCaluseNew");
                operationBinding1.execute();
                if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
                
                             BindingContainer bindings = getBindings();
                             OperationBinding operationBinding2 =
                                 bindings.getOperationBinding("CreateInsert");
                             operationBinding2.execute();
                         }
                BindingContext bindingContext = BindingContext.getCurrent();
                DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
                ApplicationModule am = dc.getApplicationModule();
                ViewObject vo =am.findViewObject("AdditionalPOPVO1");
                vo.executeQuery();
            }
            
        public void editDialogListenerNEW(DialogEvent dialogEvent) {

            System.out.println("editDialogListener enter ----------->");
            if (dialogEvent.getOutcome().name().equals("ok")) {
               
                BindingContext bctx = BindingContext.getCurrent();
                BindingContainer bindings = bctx.getCurrentBindingsEntry();
                System.out.println("editDialogListener enter AGAIN ----------->");
                OperationBinding operationBinding =
                    bindings.getOperationBinding("FillLinesNEW");
                //invoke method
                operationBinding.execute();
                System.out.println("editDialogListener enter 2 ----------->");
                BindingContext bindingContext = BindingContext.getCurrent();
                DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
                ApplicationModule am = dc.getApplicationModule();
                ViewObject vo =am.findViewObject("AdditionBlockVO1");
                vo.executeQuery();
                System.out.println("editDialogListener enter 3----------->");
                AdfFacesContext.getCurrentInstance().addPartialTarget(ietable);
            }
        }
        
        
        /////////////////////////////////////////////////////////////////////////////////////////


        ////////////////////////////////////////new popup another tab////////////////
            public void editPopupFetchNEWTab(PopupFetchEvent popupFetchEvent) {
                System.out.println("size inter-->");
                OperationBinding operationBinding =
                    executeOperation("Commit");
                System.out.println("after sive commit NEW-->");
                if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
                             BindingContainer bindings = getBindings();
                             OperationBinding operationBinding2 =
                                 bindings.getOperationBinding("CreateInsert");
                             operationBinding2.execute();
                         }
                BindingContext bindingContext = BindingContext.getCurrent();
                DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
                ApplicationModule am = dc.getApplicationModule();
                ViewObject vo =am.findViewObject("CodeDescreptionVO1");
                vo.executeQuery();
            }
            
            
            
    public void editDialogListenerNEWTab
    (DialogEvent dialogEvent) {
            System.out.println("enter editDialogListShade-------------->");
            if (dialogEvent.getOutcome().name().equals("ok")) {


                OperationBinding operationBinding =
                    executeOperation("FillLinesNEWTab");
                operationBinding.execute();
                System.out.println("editDialogListener enter 2 ----------->");
                              BindingContext bindingContext = BindingContext.getCurrent();
                               DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
                               ApplicationModule am = dc.getApplicationModule();
                               ViewObject vo =am.findViewObject("OffStandardLineVO1");
                               vo.executeQuery();
                AdfFacesContext.getCurrentInstance().addPartialTarget(offStandardLine);
                
               
            }

        }   
//        public void editDialogListenerNEWTab(DialogEvent dialogEvent) {
//
//            System.out.println("editDialogListener enter ----------->");
//            if (dialogEvent.getOutcome().name().equals("ok")) {
//                BindingContext bctx = BindingContext.getCurrent();
//                BindingContainer bindings = bctx.getCurrentBindingsEntry();
//                System.out.println("editDialogListener enter AGAIN ----------->");
//                OperationBinding operationBinding =
//                    bindings.getOperationBinding("FillLinesNEWTab");
//                operationBinding.execute();
////                System.out.println("editDialogListener enter 2 ----------->");
////                BindingContext bindingContext = BindingContext.getCurrent();
////                DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
////                ApplicationModule am = dc.getApplicationModule();
////                ViewObject vo =am.findViewObject("OffStandardLineVO1");
////                vo.executeQuery();
////                System.out.println("editDialogListener enter 3----------->");
//               // AdfFacesContext.getCurrentInstance().addPartialTarget(ietable);
//            }
//        }
//        
//        
//        /////////////////////////////////////////////////////////////////////////////////////////



    public void setIetable(RichTable ietable) {
        this.ietable = ietable;
    }

    public RichTable getIetable() {
        return ietable;
    }

    public void setOffStandardLine(RichTable offStandardLine) {
        this.offStandardLine = offStandardLine;
    }

    public RichTable getOffStandardLine() {
        return offStandardLine;
    }
    /////////////////////
    public void SelectAll(ActionEvent actionEvent) {
        System.out.println("SelectAll");
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("FlagNEWTab", "Y");
        operationBinding.execute();
       AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable);
        System.out.println("selectAllTable");
    }
    
    public void DeSelectAll(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("FlagNEWTab", "N");
        operationBinding.execute();
    AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable);
    }
    
    ////////////////////////////////////////


    public void setSelectAllTable(RichTable selectAllTable) {
        this.selectAllTable = selectAllTable;
    }

    public RichTable getSelectAllTable() {
        return selectAllTable;
    }


    public void setTimesLine(RichInputText timesLine) {
        this.timesLine = timesLine;
    }

    public RichInputText getTimesLine() {
        return timesLine;
    }

    public void setTimesDetail(RichInputText timesDetail) {
        this.timesDetail = timesDetail;
    }

    public RichInputText getTimesDetail() {
        return timesDetail;
    }

    public void setOffStandardLineTable(RichTable offStandardLineTable) {
        this.offStandardLineTable = offStandardLineTable;
    }

    public RichTable getOffStandardLineTable() {
        return offStandardLineTable;
    }
//    public void setLineValues(String column, double value) {
//
//    oracle.adf.view.rich.component.UIXTable table = getOffStandardLineTable();
//    // Get the Selected Row key set iterator
//    java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
//    double CutQty = 0.0;
//    double val = 0.0;
//    while (selectionIt.hasNext()) {
//        Object rowKey = selectionIt.next();
//        table.setRowKey(rowKey);
//        int index = table.getRowIndex();
//        FacesCtrlHierNodeBinding row =
//            (FacesCtrlHierNodeBinding)table.getRowData(index);
//        Row selectedRow = row.getRow();
//        try {
//            val = Double.parseDouble(row.getAttribute("HeaderId").toString());
//            selectedRow.setAttribute(column, value);
//           // System.out.println("total_sam bean usman---->"+val);
//        } catch (Exception e) {
//            ;
//        }
//    }
//     AdfFacesContext.getCurrentInstance().addPartialTarget(offStandardLineTable);
//
//    }
    ///////////////////////////////////NEW/////////////////////////////
//    public String setLineValuesNEW() {
//    oracle.adf.view.rich.component.UIXTable table = getOffStandardLineTable();
//             
//     java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
//     
//     while (selectionIt.hasNext()) {
//                 Object rowKey = selectionIt.next();
//                 table.setRowKey(rowKey);
//             
//     int index = table.getRowIndex();
//     
//     FacesCtrlHierNodeBinding row =(FacesCtrlHierNodeBinding)table.getRowData(index);
//     Row selectedRow = row.getRow();
//     String v_Proposal=selectedRow.getAttribute("HeaderId").toString();
//    BindingContext bctx = BindingContext.getCurrent();
//        BindingContainer bindings = bctx.getCurrentBindingsEntry();
//        OperationBinding operationBinding =
//            bindings.getOperationBinding("GET_TOTAL_SAM");
//        operationBinding.execute();
//        if (!operationBinding.getErrors().isEmpty()) {
//            System.out.println("if errors-->"+operationBinding.getErrors());
//        }
//        Object methodReturnValue = operationBinding.getResult();
//        if (methodReturnValue != null) {
//           setLineValues("TotalStandad",Double.parseDouble(methodReturnValue.toString()));
//        //        try {
//        //
//        //            timesLine.setValue(496);
//            //timesLine.setValue(new oracle.jbo.domain.Number(methodReturnValue.toString()));
//        //        } catch (SQLException e) {
//        //        }
//        }
//        System.out.println("total_sam bean timesLine---->"+methodReturnValue.toString());
//
//    operationBinding.getParamsMap().put("p_header_id",
//                                        v_Proposal);
//    System.out.println("get line id USMAN--->"+ v_Proposal );
//
//    //invoke method
//    operationBinding.execute();
//    if (!operationBinding.getErrors().isEmpty()) {
//        System.out.println("if errors-->");
//    }   
//    }
//      
//      return null;}
    
    
    //////////////////////////
    public void Total_Attended_Minutes() {
        System.out.println("total_sam bean 1 usman---->");
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("GET_TOTAL_MINUTS");
        
        oracle.jbo.domain.Number p_header_id =(oracle.jbo.domain.Number)getHeaderId().getValue();
        operationBinding.getParamsMap().put("p_header_id", p_header_id);
        System.out.println("total_sam bean 2 usman---->"+getHeaderId().getValue());

        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->"+operationBinding.getErrors());
            // List errors = operationBinding.getErrors();
        }
    //        //optional
        Object methodReturnValue = operationBinding.getResult();
        
        if (methodReturnValue != null) {
           // samStitchNew.setValue(methodReturnValue.toString());
        
        
        try {
            totalAttendedMinHeder.setValue(new oracle.jbo.domain.Number(methodReturnValue.toString()));
        } catch (SQLException e) {
        }
        }
        System.out.println("total_sam bean usman 3---->"+methodReturnValue.toString());
    //        FacesMessage fm = new FacesMessage(message);
    //        fm.setSeverity(FacesMessage.SEVERITY_INFO);
    //        FacesContext context = FacesContext.getCurrentInstance();
    //        context.addMessage(null, fm);
    } //itemCallMethod
    
    //////////////////////////
//    public void Total_Attended_Minutes() {
//        System.out.println("if enter Total_Attended_Minutes-->");
////        oracle.adf.view.rich.component.UIXTable table = getIetable();
////                 
////         java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
////         
////         while (selectionIt.hasNext()) {
////                     Object rowKey = selectionIt.next();
////                     table.setRowKey(rowKey);
////                 
////         int index = table.getRowIndex();
////         
////         FacesCtrlHierNodeBinding row =(FacesCtrlHierNodeBinding)table.getRowData(index);
////         Row selectedRow = row.getRow();
//         //int v_Proposal=Integer.parseInt(selectedRow.getAttribute("HeaderId").toString());
////            System.out.println("if enter Total_Attended_Minutes 2-->"+v_Proposal);
////        BindingContext bctx = BindingContext.getCurrent();
////            BindingContainer bindings = bctx.getCurrentBindingsEntry();
////            OperationBinding operationBinding =
////                bindings.getOperationBinding("GET_TOTAL_MINUTS");
////            operationBinding.getParamsMap().put("p_header_id",
////                                                v_Proposal);
////            System.out.println("get line id USMAN --->"+ v_Proposal );
////            operationBinding.execute();
////            System.out.println("if enter in total_sam 3-->"+v_Proposal);
////            operationBinding.execute();
//                BindingContext bctx = BindingContext.getCurrent();
//        BindingContainer bindings = bctx.getCurrentBindingsEntry();
//        OperationBinding operationBinding =
//            bindings.getOperationBinding("GET_TOTAL_MINUTS");
//
//
//        operationBinding.getParamsMap().put("p_header_id",
//                                            getHeaderId().getValue());
//
//
//        //invoke method
//        operationBinding.execute();
//            if (!operationBinding.getErrors().isEmpty()) {
//                System.out.println("if errors-->"+operationBinding.getErrors());
//                // List errors = operationBinding.getErrors();
//            }
//            //        //optional
//            Object methodReturnValue = operationBinding.getResult();
//            
//            if (methodReturnValue != null) {
//               // samStitchNew.setValue(methodReturnValue.toString());
//            
//            
//            try {
//                totalAttendedMinHeder.setValue(new oracle.jbo.domain.Number(methodReturnValue.toString()));
//            } catch (SQLException e) {
//            }
//            }
//            System.out.println("total_sam bean usman 3---->"+totalAttendedMinHeder);
////        System.out.println("total_sam bean---->");
////        BindingContext bctx = BindingContext.getCurrent();
////        BindingContainer bindings = bctx.getCurrentBindingsEntry();
////        OperationBinding operationBinding =
////            bindings.getOperationBinding("GET_TOTAL_SAM");
////        
//////        oracle.jbo.domain.Number p_header_id =(oracle.jbo.domain.Number)getHeaderId().getValue();
//////        operationBinding.getParamsMap().put("p_header_id", p_header_id);
//////        System.out.println("total_sam bean---->"+getHeaderId().getValue());
////
////        //invoke method
////        operationBinding.execute();
////        if (!operationBinding.getErrors().isEmpty()) {
////            System.out.println("if errors-->"+operationBinding.getErrors());
////            // List errors = operationBinding.getErrors();
////        }
////    //        //optional
////        Object methodReturnValue = operationBinding.getResult();
////        
////        if (methodReturnValue != null) {
////           // samStitchNew.setValue(methodReturnValue.toString());
////           setLineValues("TotalStandad",Double.parseDouble(methodReturnValue.toString()));
////        
//////        try {
//////            
//////            timesLine.setValue(496);
////            //timesLine.setValue(new oracle.jbo.domain.Number(methodReturnValue.toString()));
//////        } catch (SQLException e) {
//////        }
////        }
////        System.out.println("total_sam bean timesLine---->"+methodReturnValue.toString());
////    //        FacesMessage fm = new FacesMessage(message);
////    //        fm.setSeverity(FacesMessage.SEVERITY_INFO);
////    //        FacesContext context = FacesContext.getCurrentInstance();
////    //        context.addMessage(null, fm);
//
//    } //itemCallMethod

    ////////////////////////////////////////////////////


    public void setWorkingHourBasic(RichInputText workingHourBasic) {
        this.workingHourBasic = workingHourBasic;
    }

    public RichInputText getWorkingHourBasic() {
        return workingHourBasic;
    }

    public void setManpowerBasic(RichInputText manpowerBasic) {
        this.manpowerBasic = manpowerBasic;
    }

    public RichInputText getManpowerBasic() {
        return manpowerBasic;
    }

    public void setWorkingHourOvertime(RichInputText workingHourOvertime) {
        this.workingHourOvertime = workingHourOvertime;
    }

    public RichInputText getWorkingHourOvertime() {
        return workingHourOvertime;
    }

    public void setManpowerOvertime(RichInputText manpowerOvertime) {
        this.manpowerOvertime = manpowerOvertime;
    }

    public RichInputText getManpowerOvertime() {
        return manpowerOvertime;
    }

    public void setWorkingHourExtraot1(RichInputText workingHourExtraot1) {
        this.workingHourExtraot1 = workingHourExtraot1;
    }

    public RichInputText getWorkingHourExtraot1() {
        return workingHourExtraot1;
    }

    public void setManPowerExtraot1(RichInputText manPowerExtraot1) {
        this.manPowerExtraot1 = manPowerExtraot1;
    }

    public RichInputText getManPowerExtraot1() {
        return manPowerExtraot1;
    }

    public void setWorkingHourExtraot2(RichInputText workingHourExtraot2) {
        this.workingHourExtraot2 = workingHourExtraot2;
    }

    public RichInputText getWorkingHourExtraot2() {
        return workingHourExtraot2;
    }

    public void setManPowerExtraot2(RichInputText manPowerExtraot2) {
        this.manPowerExtraot2 = manPowerExtraot2;
    }

    public RichInputText getManPowerExtraot2() {
        return manPowerExtraot2;
    }

    public void setTotalProduceMinutes(RichInputText totalProduceMinutes) {
        this.totalProduceMinutes = totalProduceMinutes;
    }

    public RichInputText getTotalProduceMinutes() {
        return totalProduceMinutes;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public void valueChanger(ValueChangeEvent valueChangeEvent) {
        System.out.println("valueChanger Enter--->" );
        // Add event code here...
        double WorkingHourBasic = Double.parseDouble((getWorkingHourBasic().getValue().toString()));
        System.out.println("WorkingHourBasic--->"+ WorkingHourBasic );
        double ManpowerBasic = Double.parseDouble((getManpowerBasic().getValue().toString()));
        System.out.println("ManpowerBasic--->"+ ManpowerBasic );
        double WorkingHourOvertime = Double.parseDouble((getWorkingHourOvertime().getValue().toString()));
        System.out.println("WorkingHourOvertime--->"+ WorkingHourOvertime );
        double ManpowerOvertime = Double.parseDouble((getManpowerOvertime().getValue().toString()));
        System.out.println("ManpowerOvertime--->"+ ManpowerOvertime );
        double WorkingHourExtraot1 = Double.parseDouble((getWorkingHourExtraot1().getValue().toString()));
        System.out.println("WorkingHourExtraot1--->"+ WorkingHourExtraot1 );
        double ManPowerExtraot1 = Double.parseDouble((getManPowerExtraot1().getValue().toString()));
        System.out.println("ManPowerExtraot1--->"+ ManPowerExtraot1 );
       double WorkingHourExtraot2 = Double.parseDouble((getWorkingHourExtraot2().getValue().toString()));
        System.out.println("WorkingHourExtraot2--->"+ WorkingHourExtraot2 );
       double ManPowerExtraot2 = Double.parseDouble((getManPowerExtraot2().getValue().toString()));
        System.out.println("ManPowerExtraot2--->"+ ManPowerExtraot2 );
        
        double Basic = 0.0, OverTime = 0.0, ExtraOverTime1 = 0.0,  ExtraOverTime2 = 0.0,  ADD = 0.0, NN =0.0; 
        
        Basic = WorkingHourBasic * ManpowerBasic;
            System.out.println("Basic Multiply--->"+ Basic );
            
        OverTime = WorkingHourOvertime * ManpowerOvertime ;
        
            System.out.println("OverTime Multiply--->"+ OverTime );
            
        ExtraOverTime1 = WorkingHourExtraot1 *  ManPowerExtraot1;
            System.out.println("ExtraOverTime1 Multiply--->"+ ExtraOverTime1 );
            
        ExtraOverTime2 = WorkingHourExtraot2 * ManPowerExtraot2 ;
            System.out.println("ExtraOverTime2 Multiply--->"+ ExtraOverTime2 );
        
        
        ADD = (Basic + OverTime + ExtraOverTime1 + ExtraOverTime2)*60;
        System.out.println("ADD all values--->"+ ADD );
        DecimalFormat df = new DecimalFormat("###.##");
        String add=df.format(ADD);
        ADD= Double.parseDouble(add);
      // totalProduceMinutes.setValue(ADD);   
                try {
                    totalProduceMinutes.setValue(new oracle.jbo.domain.Number(ADD));
                } catch (SQLException e) 
                {
                   
                }
        AdfFacesContext.getCurrentInstance().addPartialTarget(totalProduceMinutes);
//        try {
//            totalProduceMinutes.setValue(new oracle.jbo.domain.Number(ADD));
//            System.out.println("totalProduceMinutes--->"+ totalProduceMinutes );
//        } catch (SQLException e) 
//        {
//           
//        }

//        try {
//            markerWidthMeter.setValue(new oracle.jbo.domain.Number(MWM));
//            markerAreaInch.setValue(new oracle.jbo.domain.Number(NN));
//                    
//        } catch (Exception e) {
//            // TODO: Add catch code
//        }   
      //   AdfFacesContext.getCurrentInstance().addPartialTarget(markerWidthMeter);
    }
    public static double numeric(RichInputText ob) {
             
             
             try{
             if (ob != null)
                 return Double.parseDouble(String.valueOf(ob.getValue()));
             else
                 return 0;
             }catch(Exception e){
                 ;    
             }
             
             return 0;
         }
    
      
        public static Number toNumber(double n){


              try {
                  return new Number(n);
              } catch (SQLException e) {
                  ;
              }
              return new Number(0);
          }


    public void setTotalAttendedMinHeder(RichInputText totalAttendedMinHeder) {
        this.totalAttendedMinHeder = totalAttendedMinHeder;
    }

    public RichInputText getTotalAttendedMinHeder() {
        return totalAttendedMinHeder;
    }

    public String DeletWorkinghour() {
        Total_Attended_Minutes();
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete2");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        save();
        AdfFacesContext.getCurrentInstance().addPartialTarget(totalProduceMinutes);
        return null;
    }

    public String Back() {
     //   save();
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
          
            return null;
           
        }
        return "GoToBack";
    }
    public double getTotalProduction() {

        System.out.println("getTotalProduction Level 1");
            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("InquiryInfoAMDataControl"); //
            ApplicationModule am = dc.getApplicationModule();
            ViewObject findViewObject =am.findViewObject("LineVO1"); //ImpSaleContractDetailEOView1
       
        System.out.println("getTotalProduction Level 2");
                     
            RowSetIterator it = findViewObject.createRowSetIterator("tt");
            double val = 0.00, total = 0.00;
            while (it.hasNext()) {

                Row r = it.next();
                try {
                    // Changed By Sabih on Request of Ehsan 26-07-17 
                    // val = Double.parseDouble(r.getAttribute("TotalProduetion").toString());
                    val = Double.parseDouble(r.getAttribute("LineOutput").toString());
                } catch (Exception e) {
                    ;
                }

                total = total + val;
            } //end of while loop
            it.closeRowSetIterator();
            //return roundTo2(total);
            System.out.println("getSAMTotalQty Level 3 ---->"+total);
            //AdfFacesContext.getCurrentInstance().addPartialTarget(samStitch);
            return total;
        }
    ///////////////////
    public double gettotalStandardMinutesHeader() {

        System.out.println("getTotalProduction Level 1");
            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("InquiryInfoAMDataControl"); //
            ApplicationModule am = dc.getApplicationModule();
            ViewObject findViewObject =am.findViewObject("OffStandardVO1"); //ImpSaleContractDetailEOView1
       
        System.out.println("getTotalProduction Level 2");
                     
            RowSetIterator it = findViewObject.createRowSetIterator("tt");
            double val = 0.00, total = 0.00;
            while (it.hasNext()) {

                Row r = it.next();
                try {
                    val = Double.parseDouble(r.getAttribute("TotalStandad").toString());
                } catch (Exception e) {
                    ;
                }

                total = total + val;
            } //end of while loop
            it.closeRowSetIterator();
            //return roundTo2(total);
            System.out.println("getSAMTotalQty Level 3 ---->"+total);
            //AdfFacesContext.getCurrentInstance().addPartialTarget(samStitch);
            return total;
        }

    /////////////////


    public void setTotalProductionHeader(RichInputText totalProductionHeader) {
        this.totalProductionHeader = totalProductionHeader;
    }

    public RichInputText getTotalProductionHeader() {
        return totalProductionHeader;
    }

    public void setTotalStandardMinutesH(RichInputText totalStandardMinutesH) {
        this.totalStandardMinutesH = totalStandardMinutesH;
    }

    public RichInputText getTotalStandardMinutesH() {
        return totalStandardMinutesH;
    }

    public String Calculations() {
        save();
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        return null;
    }

    private void efficencyCalculation() {
        
        DecimalFormat df = new DecimalFormat("###.##");
        ViewObject header= am.getHederVO1();
        ViewObject line=am.getLineVO1();
        line.setRangeSize(500);
        double producedMIN=0.0;
      double  totalproducedMIN=0.0;
        Row[] r =line.getAllRowsInRange();
        System.out.println("................lineVO...................."+r.length);
        for (Row row : r) {
            try {
               producedMIN =Double.parseDouble(row.getAttribute("ProducedMin").toString());
            } catch (Exception e) {
                producedMIN = 0.0;
            }
            totalproducedMIN=totalproducedMIN+ producedMIN;
        }
        String tot=df.format(totalproducedMIN);
        totalproducedMIN=Double.parseDouble(tot);
        header.getCurrentRow().setAttribute("TotalProducedMinutes", totalproducedMIN);
        double attend =0.0;
        double effi =0.0;
        try{
            attend= Double.parseDouble(header.getCurrentRow().getAttribute("JobQty").toString());
        }catch(Exception e) {
            attend =0.0;
        }
        if(attend==0) {
            effi=0.0;
        }
        else {
            effi=(totalproducedMIN/attend)*100;
        }
       
        String ef=df.format( effi);
        effi=Double.parseDouble(ef);
        header.getCurrentRow().setAttribute("Efficiency", effi);
    }

    public void setDayProd(RichInputText dayProd) {
        this.dayProd = dayProd;
    }

    public RichInputText getDayProd() {
        return dayProd;
    }

    public void valueChangeCalculation(ValueChangeEvent valueChangeEvent) {
        double SamV = Double.parseDouble((getSamvalue().getValue().toString()));
        double daypro=0.00;
        try{
            daypro = Double.parseDouble((getDayProd().getValue().toString()));
        } 
        catch(Exception e){
            daypro=0.00;
        }
       
        
        double produceMIN=0.0;
        produceMIN=(SamV*daypro);
        
        ViewObject line =am.getLineVO1();
        line.getCurrentRow().setAttribute("ProducedMin",produceMIN);
        AdfFacesContext.getCurrentInstance().addPartialTarget(prodmin);
        
        // Add event code here...
    }

    public void setSamvalue(RichInputListOfValues samvalue) {
        this.samvalue = samvalue;
    }

    public RichInputListOfValues getSamvalue() {
        return samvalue;
    }

    public void setProdmin(RichInputText prodmin) {
        this.prodmin = prodmin;
    }

    public RichInputText getProdmin() {
        return prodmin;
    }


    public String Select_All() {
        ViewObject additionalvo = am.getAdditionalPOPVO1();
        Row[] r =additionalvo.getAllRowsInRange();
        System.out.println("...............enter....................");
        for (Row row : r) {
           // System.out.println("...............flag before...................."+row.getAttribute("FlagNEW").toString());
            row.setAttribute("FlagNEW", "Y");
           System.out.println("...............flag...................."+row.getAttribute("FlagNEW").toString());
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(additionalblocktable);
        // Add event code here...
        return null;
    }

    public void setAdditionalblocktable(RichTable additionalblocktable) {
        this.additionalblocktable = additionalblocktable;
    }

    public RichTable getAdditionalblocktable() {
        return additionalblocktable;
    }

    public String deSelect_All() {
        ViewObject additionalvo = am.getAdditionalPOPVO1();
        Row[] r =additionalvo.getAllRowsInRange();
        System.out.println("...............enter....................");
        for (Row row : r) {
           // System.out.println("...............flag before...................."+row.getAttribute("FlagNEW").toString());
            row.setAttribute("FlagNEW", "N");
           System.out.println("...............flag...................."+row.getAttribute("FlagNEW").toString());
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(additionalblocktable);
        // Add event code here...
        return null;
    }

    public String selectBpoAll() {
        // Add event code here...
        ViewObject fillbpo = am.getFillBPOsCriteria1();
        Row[] r =fillbpo.getAllRowsInRange();
        System.out.println("...............enter....................");
        for (Row row : r) {
           // System.out.println("...............flag before...................."+row.getAttribute("FlagNEW").toString());
            row.setAttribute("Flag", "Y");
           System.out.println("...............flag...................."+row.getAttribute("Flag").toString());
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(fillBpoTable);
        // Add event code here...
        
        return null;
    }

    public void setFillBpoTable(RichTable fillBpoTable) {
        this.fillBpoTable = fillBpoTable;
    }

    public RichTable getFillBpoTable() {
        return fillBpoTable;
    }

    public String deSelectBpo() {
        // Add event code here...
        
        ViewObject fillbpo = am.getFillBPOsCriteria1();
        Row[] r =fillbpo.getAllRowsInRange();
        System.out.println("...............enter....................");
        for (Row row : r) {
           // System.out.println("...............flag before...................."+row.getAttribute("FlagNEW").toString());
            row.setAttribute("Flag", "N");
           System.out.println("...............flag...................."+row.getAttribute("Flag").toString());
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(fillBpoTable);
        // Add event code here...
        
        return null;
    }

    private void total_produced_min() {
        ViewObject LineView = am.getLineVO1();
        Row[] r =LineView.getAllRowsInRange();
        DecimalFormat df = new DecimalFormat("###.##");
        for (Row row : r) {
            Double Sam=0.00;
            Double DayProduc=0.00;
            try{
                 Sam = Double.parseDouble(row.getAttribute("SamValue").toString());
            }
            catch(Exception e){
                Sam=0.00;
            }
           
            System.out.println("................SAM =.................... "+Sam);
            
            try{
                  DayProduc = Double.parseDouble(row.getAttribute("LineOutput").toString());
            }
            catch(Exception e) {
                DayProduc=0.00;
            }
           
            System.out.println("................DayProduc =.................... "+DayProduc);
            Double total_proMin=Sam*DayProduc;
            
            
            String totalprodmin=df.format(total_proMin);
            total_proMin=Double.parseDouble(totalprodmin);
            row.setAttribute("ProducedMin", total_proMin);
            System.out.println("................ total; DayProduc =.................... "+total_proMin);
    }
   
    }
}
