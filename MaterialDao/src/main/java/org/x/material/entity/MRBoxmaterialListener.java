package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * ボックスマテリアル関連マスタリスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class MRBoxmaterialListener implements EntityListener<MRBoxmaterial> {

    @Override
    public void preInsert(final MRBoxmaterial entity, final PreInsertContext<MRBoxmaterial> context) {
    }

    @Override
    public void preUpdate(final MRBoxmaterial entity, final PreUpdateContext<MRBoxmaterial> context) {
    }

    @Override
    public void preDelete(final MRBoxmaterial entity, final PreDeleteContext<MRBoxmaterial> context) {
    }

    @Override
    public void postInsert(final MRBoxmaterial entity, final PostInsertContext<MRBoxmaterial> context) {
    }

    @Override
    public void postUpdate(final MRBoxmaterial entity, final PostUpdateContext<MRBoxmaterial> context) {
    }

    @Override
    public void postDelete(final MRBoxmaterial entity, final PostDeleteContext<MRBoxmaterial> context) {
    }
}