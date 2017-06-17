package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * ボックスマスタリスナー.
 *
 * @author  nakada
 * @since   20141124.00.01
 * @version 20141124.00.01
 */
public class MLocationBoxListener implements EntityListener<MLocationBox> {

    @Override
    public void preInsert(final MLocationBox entity, final PreInsertContext<MLocationBox> context) {
    }

    @Override
    public void preUpdate(final MLocationBox entity, final PreUpdateContext<MLocationBox> context) {
    }

    @Override
    public void preDelete(final MLocationBox entity, final PreDeleteContext<MLocationBox> context) {
    }

    @Override
    public void postInsert(final MLocationBox entity, final PostInsertContext<MLocationBox> context) {
    }

    @Override
    public void postUpdate(final MLocationBox entity, final PostUpdateContext<MLocationBox> context) {
    }

    @Override
    public void postDelete(final MLocationBox entity, final PostDeleteContext<MLocationBox> context) {
    }
}