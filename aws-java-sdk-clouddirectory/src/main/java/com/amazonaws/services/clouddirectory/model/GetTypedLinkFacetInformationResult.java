/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetTypedLinkFacetInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTypedLinkFacetInformationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     */
    private java.util.List<String> identityAttributeOrder;

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     * 
     * @return A range filter that you provide for multiple attributes. The ability to filter typed links considers the
     *         order that the attributes are defined on the typed link facet. When providing ranges to typed link
     *         selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     *         specified are presumed to match the entire range. Filters are interpreted in the order of the attributes
     *         on the typed link facet, not the order in which they are supplied to any API calls.
     */

    public java.util.List<String> getIdentityAttributeOrder() {
        return identityAttributeOrder;
    }

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     * 
     * @param identityAttributeOrder
     *        A range filter that you provide for multiple attributes. The ability to filter typed links considers the
     *        order that the attributes are defined on the typed link facet. When providing ranges to typed link
     *        selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     *        specified are presumed to match the entire range. Filters are interpreted in the order of the attributes
     *        on the typed link facet, not the order in which they are supplied to any API calls.
     */

    public void setIdentityAttributeOrder(java.util.Collection<String> identityAttributeOrder) {
        if (identityAttributeOrder == null) {
            this.identityAttributeOrder = null;
            return;
        }

        this.identityAttributeOrder = new java.util.ArrayList<String>(identityAttributeOrder);
    }

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityAttributeOrder(java.util.Collection)} or
     * {@link #withIdentityAttributeOrder(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param identityAttributeOrder
     *        A range filter that you provide for multiple attributes. The ability to filter typed links considers the
     *        order that the attributes are defined on the typed link facet. When providing ranges to typed link
     *        selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     *        specified are presumed to match the entire range. Filters are interpreted in the order of the attributes
     *        on the typed link facet, not the order in which they are supplied to any API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTypedLinkFacetInformationResult withIdentityAttributeOrder(String... identityAttributeOrder) {
        if (this.identityAttributeOrder == null) {
            setIdentityAttributeOrder(new java.util.ArrayList<String>(identityAttributeOrder.length));
        }
        for (String ele : identityAttributeOrder) {
            this.identityAttributeOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A range filter that you provide for multiple attributes. The ability to filter typed links considers the order
     * that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any
     * inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to
     * match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the
     * order in which they are supplied to any API calls.
     * </p>
     * 
     * @param identityAttributeOrder
     *        A range filter that you provide for multiple attributes. The ability to filter typed links considers the
     *        order that the attributes are defined on the typed link facet. When providing ranges to typed link
     *        selection, any inexact ranges must be specified at the end. Any attributes that do not have a range
     *        specified are presumed to match the entire range. Filters are interpreted in the order of the attributes
     *        on the typed link facet, not the order in which they are supplied to any API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTypedLinkFacetInformationResult withIdentityAttributeOrder(java.util.Collection<String> identityAttributeOrder) {
        setIdentityAttributeOrder(identityAttributeOrder);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityAttributeOrder() != null)
            sb.append("IdentityAttributeOrder: ").append(getIdentityAttributeOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTypedLinkFacetInformationResult == false)
            return false;
        GetTypedLinkFacetInformationResult other = (GetTypedLinkFacetInformationResult) obj;
        if (other.getIdentityAttributeOrder() == null ^ this.getIdentityAttributeOrder() == null)
            return false;
        if (other.getIdentityAttributeOrder() != null && other.getIdentityAttributeOrder().equals(this.getIdentityAttributeOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityAttributeOrder() == null) ? 0 : getIdentityAttributeOrder().hashCode());
        return hashCode;
    }

    @Override
    public GetTypedLinkFacetInformationResult clone() {
        try {
            return (GetTypedLinkFacetInformationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}