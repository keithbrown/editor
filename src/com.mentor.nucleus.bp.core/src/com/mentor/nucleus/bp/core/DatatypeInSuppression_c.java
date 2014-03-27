package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.DatatypeInSuppression_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_DATATYPE_IN_SUPPRESSION extends genericEvent_c {
	public abstract int getEvtcode();
}

public class DatatypeInSuppression_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public DatatypeInSuppression_c(ModelRoot modelRoot,
			java.util.UUID p_m_dom_id, java.util.UUID p_m_dt_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_dom_id = IdAssigner.preprocessUUID(p_m_dom_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

		Object[] key = {m_dom_id, m_dt_id};
		addInstanceToMap(key);
	}
	static public DatatypeInSuppression_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_dom_id, java.util.UUID p_m_dt_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(DatatypeInSuppression_c.class);
		DatatypeInSuppression_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_dom_id, p_m_dt_id};
			new_inst = (DatatypeInSuppression_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_dom_id = IdAssigner.preprocessUUID(p_m_dom_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new DatatypeInSuppression_c(modelRoot, p_m_dom_id,
					p_m_dt_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public DatatypeInSuppression_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_dom_id, java.util.UUID p_m_dt_id) {
		InstanceList instances = modelRoot
				.getInstanceList(DatatypeInSuppression_c.class);
		DatatypeInSuppression_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_dom_id, p_m_dt_id};
			source = (DatatypeInSuppression_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_dom_id = IdAssigner.preprocessUUID(p_m_dom_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

				return source;
			}
		}
		// there is no instance matching the id
		DatatypeInSuppression_c new_inst = new DatatypeInSuppression_c(
				modelRoot, p_m_dom_id, p_m_dt_id);
		return new_inst;
	}
	public DatatypeInSuppression_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_dom_id = IdAssigner.NULL_UUID;
		m_dt_id = IdAssigner.NULL_UUID;
		Object[] key = {m_dom_id, m_dt_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_dom_id, m_dt_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_dom_id != p_newKey) {

			m_dom_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof DatatypeInSuppression_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof DatatypeInSuppression_c)) {
			return false;
		}

		DatatypeInSuppression_c me = (DatatypeInSuppression_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getDom_id()) || IdAssigner.NULL_UUID
				.equals(((DatatypeInSuppression_c) elem).getDom_id()))
				&& this != elem) {
			return false;
		}
		if (!getDom_id().equals(((DatatypeInSuppression_c) elem).getDom_id()))
			return false;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getDt_id()) || IdAssigner.NULL_UUID
				.equals(((DatatypeInSuppression_c) elem).getDt_id()))
				&& this != elem) {
			return false;
		}
		if (!getDt_id().equals(((DatatypeInSuppression_c) elem).getDt_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof DatatypeInSuppression_c)) {
			return false;
		}

		DatatypeInSuppression_c me = (DatatypeInSuppression_c) elem;
		if (!getDom_idCachedValue().equals(
				((DatatypeInSuppression_c) elem).getDom_idCachedValue()))
			return false;
		if (!getDt_idCachedValue().equals(
				((DatatypeInSuppression_c) elem).getDt_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_dom_id;
	private java.util.UUID m_dt_id;

	// declare association references from this class

	// referring navigation

	DataType_c ContainsSuppressedDataType;
	public void relateAcrossR47To(DataType_c target) {
		relateAcrossR47To(target, true);
	}
	public void relateAcrossR47To(DataType_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == ContainsSuppressedDataType)
			return; // already related

		if (ContainsSuppressedDataType != target) {

			Object oldKey = getInstanceKey();

			if (ContainsSuppressedDataType != null) {
				UmlProblem.removeXtUMLProblem(this, ContainsSuppressedDataType);

				ContainsSuppressedDataType.clearBackPointerR47To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"DatatypeInSuppression_c.relateAcrossR47To(DataType_c target)",
									"Relate performed across R47 from Datatype In Suppression to Data Type without unrelate of prior instance.");
				}
			}

			ContainsSuppressedDataType = target;
			if (IdAssigner.NULL_UUID.equals(target.getDt_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_dt_id = target.getDt_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR47To(this);
			target.addRef();
			UmlProblem.handleDanglingReference(this, target);
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "47", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR47From(DataType_c target) {
		unrelateAcrossR47From(target, true);
	}
	public void unrelateAcrossR47From(DataType_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (ContainsSuppressedDataType == null)
			return; // already unrelated

		if (target != ContainsSuppressedDataType) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin
					.logError(
							"Tried to unrelate from non-related instance across R47",
							e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR47To(this);
		}

		if (ContainsSuppressedDataType != null) {

			m_dt_id = ContainsSuppressedDataType.getDt_id();
			if (IdAssigner.NULL_UUID.equals(m_dt_id)) {
				m_dt_id = ContainsSuppressedDataType.getDt_idCachedValue();
			}
			ContainsSuppressedDataType = null;
			target.removeRef();
			UmlProblem.removeXtUMLProblem(this, target);
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "47", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	// referring navigation

	Domain_c IsSuppressedInDomain;
	public void relateAcrossR47To(Domain_c target) {
		relateAcrossR47To(target, true);
	}
	public void relateAcrossR47To(Domain_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSuppressedInDomain)
			return; // already related

		if (IsSuppressedInDomain != target) {

			Object oldKey = getInstanceKey();

			if (IsSuppressedInDomain != null) {
				UmlProblem.removeXtUMLProblem(this, IsSuppressedInDomain);

				IsSuppressedInDomain.clearBackPointerR47To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"DatatypeInSuppression_c.relateAcrossR47To(Domain_c target)",
									"Relate performed across R47 from Datatype In Suppression to Domain without unrelate of prior instance.");
				}
			}

			IsSuppressedInDomain = target;
			m_dom_id = target.getDom_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR47To(this);
			target.addRef();
			UmlProblem.handleDanglingReference(this, target);
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "47", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR47From(Domain_c target) {
		unrelateAcrossR47From(target, true);
	}
	public void unrelateAcrossR47From(Domain_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSuppressedInDomain == null)
			return; // already unrelated

		if (target != IsSuppressedInDomain) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin
					.logError(
							"Tried to unrelate from non-related instance across R47",
							e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR47To(this);
		}

		if (IsSuppressedInDomain != null) {

			m_dom_id = IsSuppressedInDomain.getDom_id();
			IsSuppressedInDomain = null;
			target.removeRef();
			UmlProblem.removeXtUMLProblem(this, target);
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "47", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(DataType_c[] targets) {
		return getOneS_DISOnR47(targets, null);
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(
			DataType_c[] targets, ClassQueryInterface_c test) {
		DatatypeInSuppression_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneS_DISOnR47(targets[i], test);
			}
		}

		return ret_val;
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(DataType_c target) {
		return getOneS_DISOnR47(target, null);
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(DataType_c target,
			boolean loadComponent) {
		return getOneS_DISOnR47(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(DataType_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneS_DISOnR47(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(ModelRoot modelRoot,
			DataType_c target, ClassQueryInterface_c test) {
		return getOneS_DISOnR47(modelRoot, target, test, true);
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(ModelRoot modelRoot,
			DataType_c target, ClassQueryInterface_c test, boolean loadComponent) {
		DatatypeInSuppression_c result = null;

		result = find_getOneS_DISOnR47(modelRoot, target, test);
		if (result == null && (loadComponent)) {
			// not a Containment Relation
			List comps = PersistenceManager.findAllComponents(modelRoot,
					DatatypeInSuppression_c.class);
			for (int i = 0; i < comps.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) comps
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = find_getOneS_DISOnR47(modelRoot, target, test);
						if (result != null)
							return result;
					} catch (Exception e) {
						CorePlugin.logError("Error Loading component", e);
					}
				}
			}
		}

		return result;
	}
	private static DatatypeInSuppression_c find_getOneS_DISOnR47(
			ModelRoot modelRoot, DataType_c target, ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47) {
				for (int i = 0; i < target.backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47
						.size(); ++i) {
					DatatypeInSuppression_c source = (DatatypeInSuppression_c) target.backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			DataType_c[] targets) {
		return getManyS_DISsOnR47(targets, null);
	}
	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			DataType_c[] targets, boolean loadComponent) {
		return getManyS_DISsOnR47(targets, null, loadComponent);
	}
	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			DataType_c[] targets, ClassQueryInterface_c test) {
		return getManyS_DISsOnR47(targets, test, true);
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			DataType_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new DatatypeInSuppression_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();
		if (loadComponent) {
			//not a Containment Relation
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					DatatypeInSuppression_c.class);

		}

		InstanceList instances = modelRoot
				.getInstanceList(DatatypeInSuppression_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47) {
				for (int j = 0; j < targets[i].backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47
						.size(); ++j) {
					DatatypeInSuppression_c source = (DatatypeInSuppression_c) targets[i].backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			DatatypeInSuppression_c[] ret_set = new DatatypeInSuppression_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DatatypeInSuppression_c[0];
		}
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(DataType_c target) {
		return getManyS_DISsOnR47(target, null);
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			DataType_c target, boolean loadComponent) {
		return getManyS_DISsOnR47(target, null, loadComponent);
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			DataType_c target, ClassQueryInterface_c test) {
		return getManyS_DISsOnR47(target, test, true);
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			DataType_c target, ClassQueryInterface_c test, boolean loadComponent) {
		if (target == null)
			return new DatatypeInSuppression_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		if (loadComponent) {
			//not a Containment Relation
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					DatatypeInSuppression_c.class);
		}
		Vector matches = new Vector();
		synchronized (target.backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47) {
			for (int i = 0; i < target.backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47
					.size(); ++i) {
				DatatypeInSuppression_c source = (DatatypeInSuppression_c) target.backPointer_IsSuppressedInDatatypeInSuppressionIsSuppressedIn_R47
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			DatatypeInSuppression_c[] ret_set = new DatatypeInSuppression_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DatatypeInSuppression_c[0];
		}
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(Domain_c[] targets) {
		return getOneS_DISOnR47(targets, null);
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(Domain_c[] targets,
			ClassQueryInterface_c test) {
		DatatypeInSuppression_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneS_DISOnR47(targets[i], test);
			}
		}

		return ret_val;
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(Domain_c target) {
		return getOneS_DISOnR47(target, null);
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(Domain_c target,
			boolean loadComponent) {
		return getOneS_DISOnR47(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(Domain_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneS_DISOnR47(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(ModelRoot modelRoot,
			Domain_c target, ClassQueryInterface_c test) {
		return getOneS_DISOnR47(modelRoot, target, test, true);
	}

	public static DatatypeInSuppression_c getOneS_DISOnR47(ModelRoot modelRoot,
			Domain_c target, ClassQueryInterface_c test, boolean loadComponent) {
		DatatypeInSuppression_c result = null;

		result = find_getOneS_DISOnR47(modelRoot, target, test);
		if (result == null && (loadComponent)) {
			// not a Containment Relation
			List comps = PersistenceManager.findAllComponents(modelRoot,
					DatatypeInSuppression_c.class);
			for (int i = 0; i < comps.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) comps
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = find_getOneS_DISOnR47(modelRoot, target, test);
						if (result != null)
							return result;
					} catch (Exception e) {
						CorePlugin.logError("Error Loading component", e);
					}
				}
			}
		}

		return result;
	}
	private static DatatypeInSuppression_c find_getOneS_DISOnR47(
			ModelRoot modelRoot, Domain_c target, ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47) {
				for (int i = 0; i < target.backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47
						.size(); ++i) {
					DatatypeInSuppression_c source = (DatatypeInSuppression_c) target.backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			Domain_c[] targets) {
		return getManyS_DISsOnR47(targets, null);
	}
	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			Domain_c[] targets, boolean loadComponent) {
		return getManyS_DISsOnR47(targets, null, loadComponent);
	}
	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			Domain_c[] targets, ClassQueryInterface_c test) {
		return getManyS_DISsOnR47(targets, test, true);
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(
			Domain_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new DatatypeInSuppression_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();
		if (loadComponent) {
			//not a Containment Relation
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					DatatypeInSuppression_c.class);

		}

		InstanceList instances = modelRoot
				.getInstanceList(DatatypeInSuppression_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47) {
				for (int j = 0; j < targets[i].backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47
						.size(); ++j) {
					DatatypeInSuppression_c source = (DatatypeInSuppression_c) targets[i].backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			DatatypeInSuppression_c[] ret_set = new DatatypeInSuppression_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DatatypeInSuppression_c[0];
		}
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(Domain_c target) {
		return getManyS_DISsOnR47(target, null);
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(Domain_c target,
			boolean loadComponent) {
		return getManyS_DISsOnR47(target, null, loadComponent);
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(Domain_c target,
			ClassQueryInterface_c test) {
		return getManyS_DISsOnR47(target, test, true);
	}

	public static DatatypeInSuppression_c[] getManyS_DISsOnR47(Domain_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (target == null)
			return new DatatypeInSuppression_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		if (loadComponent) {
			//not a Containment Relation
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					DatatypeInSuppression_c.class);
		}
		Vector matches = new Vector();
		synchronized (target.backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47) {
			for (int i = 0; i < target.backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47
					.size(); ++i) {
				DatatypeInSuppression_c source = (DatatypeInSuppression_c) target.backPointer_ContainsSuppressedDatatypeInSuppressionContainsSuppressed_R47
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			DatatypeInSuppression_c[] ret_set = new DatatypeInSuppression_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DatatypeInSuppression_c[0];
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		// R47
		Domain_c relInst55120 = (Domain_c) baseRoot.getInstanceList(
				Domain_c.class).get(new Object[]{m_dom_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst55120 == null) {
			relInst55120 = (Domain_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Domain_c.class)
					.get(new Object[]{m_dom_id});
		}
		if (relInst55120 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst55120 = (Domain_c) roots[i].getInstanceList(
						Domain_c.class).get(new Object[]{m_dom_id});
				if (relInst55120 != null)
					break;
			}
		}
		//synchronized
		if (relInst55120 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst55120) && !isProxy())) {
				relInst55120.relateAcrossR47To(this, notifyChanges);
			}
		}

		DataType_c relInst55121 = (DataType_c) baseRoot.getInstanceList(
				DataType_c.class).get(new Object[]{m_dt_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst55121 == null) {
			relInst55121 = (DataType_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(DataType_c.class)
					.get(new Object[]{m_dt_id});
		}
		if (relInst55121 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst55121 = (DataType_c) roots[i].getInstanceList(
						DataType_c.class).get(new Object[]{m_dt_id});
				if (relInst55121 != null)
					break;
			}
		}
		//synchronized
		if (relInst55121 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst55121) && !isProxy())) {
				relInst55121.relateAcrossR47To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R47
		// S_DOM
		inst = IsSuppressedInDomain;
		unrelateAcrossR47From(IsSuppressedInDomain, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// S_DT
		inst = ContainsSuppressedDataType;
		unrelateAcrossR47From(ContainsSuppressedDataType, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(DatatypeInSuppression_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final DatatypeInSuppression_c inst = (DatatypeInSuppression_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(DatatypeInSuppression_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static DatatypeInSuppression_c DatatypeInSuppressionInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		DatatypeInSuppression_c result = findDatatypeInSuppressionInstance(
				modelRoot, test, loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					DatatypeInSuppression_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findDatatypeInSuppressionInstance(modelRoot,
								test, loadComponent);
						if (result != null)
							return result;
					} catch (Exception e) {
						CorePlugin.logError("Error Loading component", e);
					}
				}
			}
		}
		if (result != null && loadComponent) {
			result.loadProxy();
		}
		return result;
	}
	private static DatatypeInSuppression_c findDatatypeInSuppressionInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(DatatypeInSuppression_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				DatatypeInSuppression_c x = (DatatypeInSuppression_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static DatatypeInSuppression_c DatatypeInSuppressionInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return DatatypeInSuppressionInstance(modelRoot, test, true);
	}

	public static DatatypeInSuppression_c DatatypeInSuppressionInstance(
			ModelRoot modelRoot) {
		return DatatypeInSuppressionInstance(modelRoot, null, true);
	}

	public static DatatypeInSuppression_c[] DatatypeInSuppressionInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					DatatypeInSuppression_c.class);
		}
		InstanceList instances = modelRoot
				.getInstanceList(DatatypeInSuppression_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				DatatypeInSuppression_c x = (DatatypeInSuppression_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				DatatypeInSuppression_c[] ret_set = new DatatypeInSuppression_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new DatatypeInSuppression_c[0];
			}
		}
	}
	public static DatatypeInSuppression_c[] DatatypeInSuppressionInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return DatatypeInSuppressionInstances(modelRoot, test, true);
	}
	public static DatatypeInSuppression_c[] DatatypeInSuppressionInstances(
			ModelRoot modelRoot) {
		return DatatypeInSuppressionInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Datatype In Suppression.dispose call: ";
		Domain_c testR47Inst = Domain_c.getOneS_DOMOnR47(this, false);

		if (testR47Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "47 ";
		}

		DataType_c testR47InstOth = DataType_c.getOneS_DTOnR47(this, false);

		if (testR47InstOth != null) {
			delete_error = true;
			errorMsg = errorMsg + "47 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Datatype In Suppression",
						errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("dom_id")) {
			return true;
		}
		if (attributeName.equals("dt_id")) {
			return true;
		}
		return false;
	}
	public String getCompUniqueID() {
		UUID tempID = null;
		long longID = 0L;
		StringBuffer result = new StringBuffer();

		tempID = getDom_id();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getDom_idCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		tempID = getDt_id();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getDt_idCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		return result.toString();
	}
	// declare attribute accessors
	public long getDom_idLongBased() {
		if (IsSuppressedInDomain != null) {
			return IsSuppressedInDomain.getDom_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getDom_id() {
		if (IsSuppressedInDomain != null) {
			return IsSuppressedInDomain.getDom_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getDom_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_dom_id))
			return m_dom_id;
		else
			return getDom_id();
	}

	public void setDom_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_dom_id)) {
				return;
			}
		} else if (m_dom_id != null) {
			if (m_dom_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Dom_id", m_dom_id, newValue, true);
		m_dom_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public long getDt_idLongBased() {
		if (ContainsSuppressedDataType != null) {
			return ContainsSuppressedDataType.getDt_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getDt_id() {
		if (ContainsSuppressedDataType != null) {
			return ContainsSuppressedDataType.getDt_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getDt_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_dt_id))
			return m_dt_id;
		else
			return getDt_id();
	}

	public void setDt_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_dt_id)) {
				return;
			}
		} else if (m_dt_id != null) {
			if (m_dt_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Dt_id",
				m_dt_id, newValue, true);
		m_dt_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Datatype In Suppression", //$NON-NLS-1$
						" Operation entered: Datatype In Suppression::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		DatatypeInSuppression_c[] objs = DatatypeInSuppression_c
				.DatatypeInSuppressionInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Datatype In Suppression", //$NON-NLS-1$
						" Operation entered: Datatype In Suppression::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class DatatypeInSuppression_c_test55123_c
				implements
					ClassQueryInterface_c {
			DatatypeInSuppression_c_test55123_c(java.util.UUID p55124,
					java.util.UUID p55125) {
				m_p55124 = p55124;
				m_p55125 = p55125;
			}
			private java.util.UUID m_p55124;
			private java.util.UUID m_p55125;
			public boolean evaluate(Object candidate) {
				DatatypeInSuppression_c selected = (DatatypeInSuppression_c) candidate;
				boolean retval = false;
				retval = (selected.getDom_id().equals(m_p55124))
						& (selected.getDt_id().equals(m_p55125));
				return retval;
			}
		}

		DatatypeInSuppression_c[] objs55122 = DatatypeInSuppression_c
				.DatatypeInSuppressionInstances(modelRoot,
						new DatatypeInSuppression_c_test55123_c(getDom_id(),
								getDt_id()));

		if (((objs55122.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Datatype In Suppression", //$NON-NLS-1$
								"Consistency: Object: Datatype In Suppression: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs55122.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Datatype In Suppression: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs55122.length), e);
			}
			retval = false;

		}

		if (((objs55122.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Datatype In Suppression", //$NON-NLS-1$
								"Consistency: Object: Datatype In Suppression: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs55122.length)
										+ " Dom_ID: " + "Not Printable" + " DT_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Datatype In Suppression: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs55122.length)
										+ " Dom_ID: " + "Not Printable" + " DT_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Datatype In Suppression is a link class in association: rel.Numb = 47
		// Other side
		return retval;
	}

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Datatype In Suppression