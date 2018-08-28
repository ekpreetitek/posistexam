/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posistexam;

import java.util.Date;

/**
 *
 * @author mca
 */
public class Node implements Comparable<Node> {
    Date timestamp;
    OwnerData ownerData;
    int nodeNumber;
    String nodeID;
    String referenceNodeID;
    String childRefernceNodeID;
    String genesisReferenceNodeId;

    public Node(Date timestamp, OwnerData ownerData, int nodeNumber, String nodeID, String referenceNodeID, String childRefernceNodeID, String genesisReferenceNodeId) {
        this.timestamp = timestamp;
        this.ownerData = ownerData;
        this.nodeNumber = nodeNumber;
        this.nodeID = nodeID;
        this.referenceNodeID = referenceNodeID;
        this.childRefernceNodeID = childRefernceNodeID;
        this.genesisReferenceNodeId = genesisReferenceNodeId;
    }
    
    

    public String getChildRefernceNodeID() {
        return childRefernceNodeID;
    }

    public void setChildRefernceNodeID(String childRefernceNodeID) {
        this.childRefernceNodeID = childRefernceNodeID;
    }

    public String getGenesisReferenceNodeId() {
        return genesisReferenceNodeId;
    }

    public void setGenesisReferenceNodeId(String genesisReferenceNodeId) {
        this.genesisReferenceNodeId = genesisReferenceNodeId;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public int getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(int nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    public OwnerData getOwnerData() {
        return ownerData;
    }

    public void setOwnerData(OwnerData ownerData) {
        this.ownerData = ownerData;
    }

    public String getReferenceNodeID() {
        return referenceNodeID;
    }

    public void setReferenceNodeID(String referenceNodeID) {
        this.referenceNodeID = referenceNodeID;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

 
    

    @Override
    public int compareTo(Node o) {
        if(this.getOwnerData().getValue() == o.getOwnerData().getValue()) 
            return 0;  
        else if(this.getOwnerData().getValue() > o.getOwnerData().getValue())  
            return 1;  
        else  
            return -1;     
    }

   
    
}
