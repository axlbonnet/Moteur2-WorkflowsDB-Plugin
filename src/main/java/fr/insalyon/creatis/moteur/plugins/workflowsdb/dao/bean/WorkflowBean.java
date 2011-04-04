 /* Copyright CNRS-I3S
 *
 * Johan Montagnat
 * johan@i3s.unice.fr
 * http://www.i3s.unice.fr/~johan
 *
 * This software is a grid-enabled data-driven workflow manager and editor.
 *
 * This software is governed by the CeCILL  license under French law and
 * abiding by the rules of distribution of free software.  You can  use,
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and,  more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 */
package fr.insalyon.creatis.moteur.plugins.workflowsdb.dao.bean;

import java.util.Date;

/**
 *
 * @author Rafael Silva
 */
public class WorkflowBean {

    private String id;
    private String application;
    private String user;
    private Date startTime;
    private Date finishTime;
    private String majorStatus;
    private String minorStatus;
    private int moteurID;
    private int moteurKey;

    public WorkflowBean(String id, String application, String user, Date startTime, String majorStatus, String minorStatus, int moteurID, int moteurKey) {
        this.id = id;
        this.application = application;
        this.user = user;
        this.startTime = startTime;
        this.majorStatus = majorStatus;
        this.minorStatus = minorStatus;
        this.moteurID = moteurID;
        this.moteurKey = moteurKey;
        this.finishTime = new Date();
    }

    public String getApplication() {
        return application;
    }

    public String getId() {
        return id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public String getMajorStatus() {
        return majorStatus;
    }

    public String getMinorStatus() {
        return minorStatus;
    }

    public String getUser() {
        return user;
    }

    public int getMoteurID() {
        return moteurID;
    }

    public int getMoteurKey() {
        return moteurKey;
    }

    public void setMajorStatus(String majorStatus) {
        this.majorStatus = majorStatus;
    }

    public void setMinorStatus(String minorStatus) {
        this.minorStatus = minorStatus;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}
