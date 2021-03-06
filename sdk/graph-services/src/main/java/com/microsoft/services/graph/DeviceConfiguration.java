/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;



/**
 * The type Device Configuration.
*/
public class DeviceConfiguration extends DirectoryObject {

    public DeviceConfiguration(){
        setODataType("#Microsoft.Graph.DeviceConfiguration");
    }
    
        
    private java.util.List<byte[]> publicIssuerCertificates = null;
    
    
     
    /**
    * Gets the public Issuer Certificates.
    *
    * @return the java.util.List<byte[]>
    */
    public java.util.List<byte[]> getPublicIssuerCertificates() {
        return this.publicIssuerCertificates; 
    }

    /**
    * Sets the public Issuer Certificates.
    *
    * @param value the java.util.List<byte[]>
    */
    public void setPublicIssuerCertificates(java.util.List<byte[]> value) { 
        this.publicIssuerCertificates = value; 
        valueChanged("publicIssuerCertificates", value);

    }
    
        
    private java.util.List<byte[]> cloudPublicIssuerCertificates = null;
    
    
     
    /**
    * Gets the cloud Public Issuer Certificates.
    *
    * @return the java.util.List<byte[]>
    */
    public java.util.List<byte[]> getCloudPublicIssuerCertificates() {
        return this.cloudPublicIssuerCertificates; 
    }

    /**
    * Sets the cloud Public Issuer Certificates.
    *
    * @param value the java.util.List<byte[]>
    */
    public void setCloudPublicIssuerCertificates(java.util.List<byte[]> value) { 
        this.cloudPublicIssuerCertificates = value; 
        valueChanged("cloudPublicIssuerCertificates", value);

    }
            
    private Integer registrationQuota;
     
    /**
    * Gets the registration Quota.
    *
    * @return the Integer
    */
    public Integer getRegistrationQuota() {
        return this.registrationQuota; 
    }

    /**
    * Sets the registration Quota.
    *
    * @param value the Integer
    */
    public void setRegistrationQuota(Integer value) { 
        this.registrationQuota = value; 
        valueChanged("registrationQuota", value);

    }
            
    private Integer maximumRegistrationInactivityPeriod;
     
    /**
    * Gets the maximum Registration Inactivity Period.
    *
    * @return the Integer
    */
    public Integer getMaximumRegistrationInactivityPeriod() {
        return this.maximumRegistrationInactivityPeriod; 
    }

    /**
    * Sets the maximum Registration Inactivity Period.
    *
    * @param value the Integer
    */
    public void setMaximumRegistrationInactivityPeriod(Integer value) { 
        this.maximumRegistrationInactivityPeriod = value; 
        valueChanged("maximumRegistrationInactivityPeriod", value);

    }
}

