package mnj.ont.model.lov.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 18 16:20:06 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LineNoCodeVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public LineNoCodeVOImpl() {
    }


    /**
     * Returns the variable value for p_opdescription.
     * @return variable value for p_opdescription
     */
    public String getp_opdescription() {
        return (String)ensureVariableManager().getVariableValue("p_opdescription");
    }

    /**
     * Sets <code>value</code> for variable p_opdescription.
     * @param value value to bind as p_opdescription
     */
    public void setp_opdescription(String value) {
        ensureVariableManager().setVariableValue("p_opdescription", value);
    }

    /**
     * Returns the bind variable value for p_stn.
     * @return bind variable value for p_stn
     */
    public String getp_stn() {
        return (String)getNamedWhereClauseParam("p_stn");
    }

    /**
     * Sets <code>value</code> for bind variable p_stn.
     * @param value value to bind as p_stn
     */
    public void setp_stn(String value) {
        setNamedWhereClauseParam("p_stn", value);
    }
}
