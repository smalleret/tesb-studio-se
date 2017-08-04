// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2013 Talend – www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.repository.view.route.viewer.content;

import org.junit.Assert;
import org.junit.Test;
import org.talend.camel.model.CamelRepositoryNodeType;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProjectRepositoryNode;

public class ESBTypeContentProviderTest {

    /**
     * Test method for
     * {@link org.talend.repository.view.route.viewer.content.BeansContentProvider#getTopLevelNodeFromProjectRepositoryNode(org.talend.core.repository.model.ProjectRepositoryNode)}
     * {@link org.talend.repository.view.route.viewer.content.RouteResourceContentProvider#getTopLevelNodeFromProjectRepositoryNode(org.talend.core.repository.model.ProjectRepositoryNode)}
     * {@link org.talend.repository.view.route.viewer.content.RouteResourceContentProvider#getTopLevelNodeFromProjectRepositoryNode(org.talend.core.repository.model.ProjectRepositoryNode)}
     * .
     */
    @Test
    public void testGetTopLevelNodeFromProjectRepositoryNode() {
        ProjectRepositoryNode node = (ProjectRepositoryNode) ProjectRepositoryNode.getInstance()
                .getRootRepositoryNode(ERepositoryObjectType.PROCESS_ROUTE).getRoot();

        Assert.assertEquals(ERepositoryObjectType.PROCESS_ROUTE.PROCESS_ROUTE, new RoutesContentProvider()
                .getTopLevelNodeFromProjectRepositoryNode(node).getContentType());

        ProjectRepositoryNode node2 = (ProjectRepositoryNode) ProjectRepositoryNode.getInstance()
                .getRootRepositoryNode(CamelRepositoryNodeType.repositoryBeansType).getRoot();

        Assert.assertEquals(CamelRepositoryNodeType.repositoryBeansType, new BeansContentProvider()
                .getTopLevelNodeFromProjectRepositoryNode(node2).getContentType());

        ProjectRepositoryNode node3 = (ProjectRepositoryNode) ProjectRepositoryNode.getInstance()
                .getRootRepositoryNode(CamelRepositoryNodeType.repositoryRouteResourceType).getRoot();

        Assert.assertEquals(CamelRepositoryNodeType.repositoryRouteResourceType, new RouteResourceContentProvider()
                .getTopLevelNodeFromProjectRepositoryNode(node3).getContentType());

    }

}