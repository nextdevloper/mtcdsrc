package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 組織情報マスタリスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class MStructureListener implements EntityListener<MStructure> {

    @Override
    public void preInsert(final MStructure entity, final PreInsertContext<MStructure> context) {
    }

    @Override
    public void preUpdate(final MStructure entity, final PreUpdateContext<MStructure> context) {
    }

    @Override
    public void preDelete(final MStructure entity, final PreDeleteContext<MStructure> context) {
    }

    @Override
    public void postInsert(final MStructure entity, final PostInsertContext<MStructure> context) {
    }

    @Override
    public void postUpdate(final MStructure entity, final PostUpdateContext<MStructure> context) {
    }

    @Override
    public void postDelete(final MStructure entity, final PostDeleteContext<MStructure> context) {
    }
}