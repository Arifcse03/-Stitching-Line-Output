package mnj.ont.model.services.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jul 14 14:30:00 PKT 2015
// ---------------------------------------------------------------------
public interface InquiryInfoAM extends ApplicationModule {

    String callPost(String headerId);

    void FillLines();

    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);

    void FillSizes();

    void setSizeWherCaluse();


    int sumtotalRejectiondetail(String OutSublineId);

    int sumtotalprodetail(String OutSublineId);

    int sumtotalProductionWIPLINE(String ProdTransId);

    int sumtotalprodetailWIP(String OutSublineId);

    int sumtotalProduction();

    int sumtotalRejection();

    String CalculateTotalProductionNewLINE(String headerId);

    void ExecuteBlock();

    void setSizeWherCaluseNew();

    void FillLinesNEW();

    void FillLinesNEWTab();

    void selectAllLines(String flag);


    double GET_TOTAL_MINUTS(int p_header_id);

    String completion(String headerId, String respId);
}
