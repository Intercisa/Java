/* tslint:disable */
/* eslint-disable */
/* tslint:disable */// Generated using typescript-generator version 2.16.538 on 2020-08-23 12:29:16.

import { Moment } from "moment";

export interface ActiveModel extends BaseVersionModel {
    active: boolean;
}

export interface BaseDocument {
    fileMetaId: number;
}

export interface BaseHierarchy extends Serializable {
    children: BaseHierarchy[];
}

export interface BaseModel extends Serializable {
    id: number;
}

export interface BaseVersionModel extends BaseModel {
    version: number;
}

export interface ChangePassword {
    username: string;
    oldPassword: string;
    newPassword: string;
}

export interface ChangePasswordByAdmin {
    username: string;
    password: string;
}

export interface ContactType extends ActiveModel {
    name: string;
}

export interface Contract extends BaseVersionModel {
    ownIdentifier: string;
    foreignIdentifier: string;
    previousDescription: string;
    notes: string;
    subject: string;
    contractDate: Moment;
    location: string;
    amount: number;
    procurementPrice: number;
    contractType: number[];
    currency: number;
    partnerId: number;
    operativeStartDate: Moment;
    guaranteeBegin: Moment;
    guaranteeEnd: Moment;
    sheetAttached: boolean;
    organizationId: number;
    ownerId: number;
    status: ContractStatus;
    closingDate: Moment;
    closingReasonId: number;
    grantedRoles: Role[];
    mediatedServiceIncluded: boolean;
}

export interface ContractClosingData extends BaseModel {
    date: Moment;
    reason: number;
}

export interface ContractClosingReason extends ActiveModel {
    name: string;
}

export interface ContractContact extends BaseModel {
    contractId: number;
    internalExternal: InternalExternal;
    contactTypeId: number;
    name: string;
    email: string;
    phone: string;
    position: string;
    costCenterId: number;
}

export interface ContractContactListItem extends BaseModel {
    internalExternal: InternalExternal;
    contactType: string;
    name: string;
}

export interface ContractContinuousFulfillment extends BaseVersionModel {
    contractId: number;
    fulfillmentDate: Moment;
    fulfillmentAmount: number;
}

export interface ContractContinuousFulfillmentListItem extends BaseModel {
    contractId: number;
    fulfillmentDate: Moment;
    fulfillmentAmount: string;
    invoiceDate: Moment;
    invoiceNumber: string;
    paymentDate: Moment;
}

export interface ContractContinuousFulfillmentPayment extends BaseModel {
    invoiceDate: Moment;
    invoiceNumber: string;
    paymentDate: Moment;
}

export interface ContractDeadlines extends BaseVersionModel {
    finalDeliveryDeadline: Moment;
    paymentDeadline: number;
    continuousFulfillmentAmount: number;
    guaranteeBegin: Moment;
    guaranteeEnd: Moment;
    sheetAttached: boolean;
    firstRealFulfillmentDate: Moment;
    fulfillmentRepeatType: FulfillmentRepeatType;
    fulfillmentRepeatDay: number;
}

export interface ContractDocument extends BaseVersionModel, BaseDocument {
    comment: string;
    fileName: string;
    documentTypeName: string;
    contractId: number;
    documentTypeId: number;
}

export interface ContractFulfillment extends BaseVersionModel {
    contractId: number;
    frozen: boolean;
    fulfillmentMode: FulfillmentMode;
    contractScope: ContractScope;
}

export interface ContractLinkType extends ActiveModel {
    name: string;
}

export interface ContractListItem extends BaseModel {
    ownIdentifier: string;
    subject: string;
    contractDate: Moment;
    status: ContractStatus;
    partner_Name: string;
    amount: string;
    contractType: string[];
    owner: string;
    createdBy: string;
    modifiedBy: string;
    grantedRoles: Role[];
}

export interface ContractMilestone extends BaseVersionModel {
    contractId: number;
    milestoneDate: Moment;
    partialFulfillmentAmount: number;
    note: string;
    deliverableProducts: ContractMilestoneDeliverableProduct[];
}

export interface ContractMilestoneDeliverableProduct extends BaseVersionModel {
    deliverableProductId: number;
    deliverableProductName: string;
    contractMilestoneId: number;
}

export interface ContractMilestoneListItem extends BaseModel {
    contractId: number;
    milestoneDate: Moment;
    deliveryAcknowledgementDate: Moment;
    invoiceDate: Moment;
    paymentDate: Moment;
    milestoneAmount: string;
    amount: number;
}

export interface ContractMilestonePayment extends BaseModel {
    deliveryAcknowledgementDate: Moment;
    invoiceDate: Moment;
    paymentDate: Moment;
    invoiceNumber: string;
}

export interface ContractNote extends BaseModel {
    contractId: number;
    note: string;
    created: Moment;
    createdBy: string;
}

export interface ContractNoteListItem extends BaseModel {
    note: string;
    created: Moment;
    createdBy: string;
}

export interface ContractPartnerTreeNode<T> extends BaseModel {
    nodeType: ContractPartnerTreeNodeType;
    relationType: ContractPartnerTreeNodeRelationType;
    foundValues: FieldSearchResult[];
    data: T;
}

export interface ContractPenalty extends BaseVersionModel {
    contractId: number;
    penaltyType: number;
    scale: Scale;
    quantity: number;
    remark: string;
}

export interface ContractPenaltyListItem extends BaseModel {
    penaltyType: string;
    penaltyValue: string;
    remark: string;
}

export interface ContractTreeNodeItem extends BaseModel {
    ownIdentifier: string;
    contractDate: Moment;
    subject: string;
    partnerName: string;
    linkType: string;
    contractType: string[];
}

export interface ContractType extends ActiveModel {
    name: string;
}

export interface CostCenter extends ActiveModel {
    name: string;
}

export interface Currency extends ActiveModel {
    name: string;
}

export interface Delegate extends ActiveModel {
    name: string;
    assignment: string;
    partnerId: number;
}

export interface DeliverableProduct extends ActiveModel {
    name: string;
}

export interface DocumentTemplate extends BaseVersionModel, BaseDocument {
    name: string;
    comment: string;
    templateType: number;
    templateTypeName: string;
    fileName: string;
}

export interface DocumentType extends ActiveModel {
    name: string;
}

export interface DownloadLink {
    url: string;
}

export interface ErrorDetails extends Serializable {
    errorCode: ErrorCode;
    data: any;
}

export interface FieldSearchResult {
    fieldKey: FieldSearchKey;
    fieldValue: string;
}

export interface GetRowsRequest {
    startRow: number;
    endRow: number;
    filters: FilterDefinition[];
    orderings: OrderDefinition[];
}

export interface FilterCondition {
    operator: FilterOperator;
    filterType: FilterType;
    filter: string;
    filterTo: string;
}

export interface FilterDefinition {
    field: string;
    condition1: FilterCondition;
    condition2: FilterCondition;
    operator: ConditionOperator;
}

export interface OrderDefinition {
    colId: string;
    sort: SortDirection;
}

export interface Guarantee extends BaseVersionModel {
    contractId: number;
    guaranteeNatureId: number;
    guaranteeTypeId: number;
    value: number;
    unit: GuaranteeUnit;
    deadline: Moment;
}

export interface GuaranteeListItem extends BaseVersionModel {
    guaranteeNature: string;
    guaranteeType: string;
    guaranteeAmount: string;
    deadline: Moment;
}

export interface GuaranteeNature extends ActiveModel {
    name: string;
}

export interface GuaranteeType extends ActiveModel {
    name: string;
}

export interface PaymentType extends ActiveModel {
    name: string;
}

export interface KnownPartnerListItem extends BaseVersionModel {
    name: string;
    shortName: string;
    taxNo: string;
    registrationNumberType: string;
    registerNumber: string;
    officeAddress: string;
}

export interface LinkedContract extends BaseVersionModel {
    contractLinkTypeId: number;
    targetContractId: number;
    sourceContractId: number;
}

export interface LinkedContractCreateData extends BaseModel {
    sourceContractId: number;
    contractLinkTypeId: number;
    contract: Contract;
    copyGuaranteeList: boolean;
    copyPenaltyInformations: boolean;
}

export interface LinkedContractListItem extends LinkedContract {
    contractLinkTypeName: string;
    sourceContractIdentifier: string;
    sourceContractTypeName: string;
    sourceContractDate: Moment;
    sourceContractSubject: string;
    targetContractIdentifier: string;
    targetContractTypeName: string;
    targetContractDate: Moment;
    targetContractSubject: string;
}

export interface MinioMeta extends BaseVersionModel {
    bucketName: string;
    objectId: string;
    contentType: string;
    fileName: string;
}

export interface Organization extends ActiveModel {
    name: string;
    parentOrganizationId: number;
    blockRoleInheritance: boolean;
}

export interface OrganizationListItem extends ActiveModel {
    name: string;
    parentOrganizationId: number;
    parentOrganizationName: string;
}

export interface PagedResponse<T> {
    rows: T[];
    lastRow: number;
}

export interface Partner extends ActiveModel {
    name: string;
    shortName: string;
    taxNo: string;
    registrationNumberType: RegisterNumberType;
    registerNumber: string;
    kefId: string;
    officeAddress: string;
    accountManagementBank: string;
    accountNumber: string;
    parentPartners: number[];
    delegates: Delegate[];
}

export interface PartnerListItem extends ActiveModel {
    name: string;
    shortName: string;
    taxNo: string;
    registrationNumberType_Name: string;
    registerNumber: string;
    kefId: string;
}

export interface PartnerTreeNodeItem extends BaseModel {
    name: string;
    officeAddress: string;
    taxNo: string;
    registrationNumberTypeId: number;
    registrationNumberType: string;
    registerNumber: string;
}

export interface PenaltyType extends ActiveModel {
    name: string;
}

export interface RegisterNumberType extends ActiveModel {
    name: string;
}

export interface RoleGroup extends ActiveModel {
    name: string;
    roles: Role[];
}

export interface SessionInfo {
    sessionTimeoutWarningMillis: number;
    sessionTimeoutMillis: number;
}

export interface TaskDescriptor extends BaseModel {
    assigneeId: number;
    creatorId: number;
    taskType: TaskTypeEnum;
    name: string;
    description: string;
    autoClose: boolean;
    deadline: Moment;
    priority: TaskPriority;
    status: TaskStatus;
    context: { [index: string]: number };
}

export interface TaskListItem extends BaseModel {
    assignee: string;
    taskType: TaskTypeEnum;
    name: string;
    description: string;
    activation: Moment;
    deadline: Moment;
    priority: TaskPriority;
    status: TaskStatus;
}

export interface TaskType extends BaseVersionModel {
    type: TaskTypeEnum;
    description: string;
    defaultPriority: TaskPriority;
    activationDays: number;
    warningDays: number;
    notification: string;
    otherNotifiedPersons: string[];
}

export interface TemplateType extends ActiveModel {
    name: string;
}

export interface User extends ActiveModel {
    username: string;
    password: string;
    fullName: string;
    email: string;
    phone: string;
    comment: string;
    needNotification: boolean;
    roleGroups: RoleGroup[];
}

export interface UserListItem extends ActiveModel {
    username: string;
    fullName: string;
    email: string;
    modified: Moment;
}

export interface OrganizationHierarchy extends BaseHierarchy {
    organizationId: number;
    organizationName: string;
}

export interface OrganizationRoleAssigment extends BaseModel, Serializable {
    name: string;
    blockInheritance: boolean;
    groups: number[];
}

export interface EmailRequest extends Serializable {
    emails: string[];
    subject: string;
    text: string;
}

export interface NotificationRequest extends Serializable {
    notificationType: NotificationTypeEnum;
    userIds: number[];
    templateParameters: { [index: string]: any };
}

export interface NotificationType extends Serializable {
    name: NotificationTypeEnum;
    subject: string;
    template: string;
}

export interface RoleGroupEmailRequest extends Serializable {
    roleGroupIds: number[];
    subject: string;
    body: string;
}

export interface Serializable {
}

export enum ContractPartnerTreeNodeRelationType {
    PARENT = "PARENT",
    CHILD = "CHILD",
    ROOT = "ROOT",
    OWN = "OWN",
}

export enum ContractPartnerTreeNodeType {
    PARTNER = "PARTNER",
    CONTRACT = "CONTRACT",
}

export enum ContractScope {
    DEFINITE = "DEFINITE",
    INDEFINITE = "INDEFINITE",
}

export enum ContractStatus {
    ACTIVE = "ACTIVE",
    CLOSED = "CLOSED",
}

export enum ErrorCode {
    USER_NOT_FOUND = "USER_NOT_FOUND",
    ADMIN_ROLE_GROUP_PROTECTED = "ADMIN_ROLE_GROUP_PROTECTED",
    OTHER_USER_PASSWORD_MODIFICATION = "OTHER_USER_PASSWORD_MODIFICATION",
    ADMIN_OWN_PASSWORD_MODIFICATION = "ADMIN_OWN_PASSWORD_MODIFICATION",
    MINIO_NOT_FOUND = "MINIO_NOT_FOUND",
    PASSWORD_MISMATCH = "PASSWORD_MISMATCH",
    DATE_FILTER = "DATE_FILTER",
    ENTITY_NOT_FOUND = "ENTITY_NOT_FOUND",
    SOURCE_NOT_FOUND = "SOURCE_NOT_FOUND",
    INVALID_PARAMETERS = "INVALID_PARAMETERS",
    CONSTRAINT_VIOLATION = "CONSTRAINT_VIOLATION",
    DELETE_CONSTRAINT_VIOLATION = "DELETE_CONSTRAINT_VIOLATION",
    ADMIN_ROLE_ASSIGNMENT_PREVENTED = "ADMIN_ROLE_ASSIGNMENT_PREVENTED",
    MISSING_MANDATORY_PARAMETER = "MISSING_MANDATORY_PARAMETER",
    THYMELEAF_VALUE_PARSE_ERROR = "THYMELEAF_VALUE_PARSE_ERROR",
    ORGANIZATION_HAS_ACTIVE_CHILD = "ORGANIZATION_HAS_ACTIVE_CHILD",
    ROOT_ORGANIZATION_DEACTIVATION_NOT_PERMITTED = "ROOT_ORGANIZATION_DEACTIVATION_NOT_PERMITTED",
    ROOT_ORGANIZATION_DELETE_NOT_PERMITTED = "ROOT_ORGANIZATION_DELETE_NOT_PERMITTED",
    ROOT_PARENT_MODIFY_NOT_PERMITTED = "ROOT_PARENT_MODIFY_NOT_PERMITTED",
    ONLY_ONE_ROOT_ORGANIZATION_POSSIBLE = "ONLY_ONE_ROOT_ORGANIZATION_POSSIBLE",
    CIRCULAR_REFERENCE_IN_ORGANIZATION_HIERARCHY = "CIRCULAR_REFERENCE_IN_ORGANIZATION_HIERARCHY",
}

export enum FieldSearchKey {
    PARTNER_NAME = "PARTNER_NAME",
    PARTNER_SHORT_NAME = "PARTNER_SHORT_NAME",
    TAX_NO = "TAX_NO",
    REGISTER_NUMBER = "REGISTER_NUMBER",
    KEF_ID = "KEF_ID",
    OFFICE_ADDRESS = "OFFICE_ADDRESS",
    ACCOUNT_BANK = "ACCOUNT_BANK",
    ACCOUNT_NUMBER = "ACCOUNT_NUMBER",
    REGISTRATION_NUMBER_TYPE = "REGISTRATION_NUMBER_TYPE",
    DELEGATE_ASSIGNMENT = "DELEGATE_ASSIGNMENT",
    DELEGATE_NAME = "DELEGATE_NAME",
    OWN_ID = "OWN_ID",
    FOREIGN_ID = "FOREIGN_ID",
    PREVIOUS_DESCRIPTION = "PREVIOUS_DESCRIPTION",
    NOTE = "NOTE",
    SUBJECT = "SUBJECT",
    CONTRACT_DATE = "CONTRACT_DATE",
    OPERATIVE_START_DATE = "OPERATIVE_START_DATE",
    LOCATION = "LOCATION",
    CLOSING_DATE = "CLOSING_DATE",
    CONTRACT_TYPE = "CONTRACT_TYPE",
    CONTRACT_CURRENCY = "CONTRACT_CURRENCY",
    DOCUMENT_NAME = "DOCUMENT_NAME",
    DOCUMENT_TYPE = "DOCUMENT_TYPE",
    DOCUMENT_FILENAME = "DOCUMENT_FILENAME",
    OWNER_NAME = "OWNER_NAME",
    OWNER_FULLNAME = "OWNER_FULLNAME",
    OWNER_EMAIL = "OWNER_EMAIL",
    OWNER_PHONE = "OWNER_PHONE",
    CONTRACT_CLOSING_REASON = "CONTRACT_CLOSING_REASON",
    MILESTONE_NOTE = "MILESTONE_NOTE",
    MILESTONE_INV_NUMBER = "MILESTONE_INV_NUMBER",
    MILESTONE_DATE = "MILESTONE_DATE",
    MILESTONE_DELIVERY_ACKNOWLEDGEMENT_DATE = "MILESTONE_DELIVERY_ACKNOWLEDGEMENT_DATE",
    MILESTONE_INV_DATE = "MILESTONE_INV_DATE",
    MILESTONE_PAYMENT_DATE = "MILESTONE_PAYMENT_DATE",
    GUARANTEE_DEADLINE = "GUARANTEE_DEADLINE",
    GUARANTEE_NATURE = "GUARANTEE_NATURE",
    GUARANTEE_TYPE = "GUARANTEE_TYPE",
    PENALTY_REMARK = "PENALTY_REMARK",
    PENALTY_TYPE = "PENALTY_TYPE",
    CONTACT_NAME = "CONTACT_NAME",
    CONTACT_EMAIL = "CONTACT_EMAIL",
    CONTACT_PHONE = "CONTACT_PHONE",
    CONTACT_POSITION = "CONTACT_POSITION",
    CONTACT_TYPE = "CONTACT_TYPE",
    CONTACT_COST_CENTER = "CONTACT_COST_CENTER",
    NOTES_TEXT = "NOTES_TEXT",
    FINAL_DELIVERY_DEADLINE = "FINAL_DELIVERY_DEADLINE",
    FINAL_GUARANTEE_BEGIN = "FINAL_GUARANTEE_BEGIN",
    FINAL_GUARANTEE_END = "FINAL_GUARANTEE_END",
    CONTINUOUS_INVOICE = "CONTINUOUS_INVOICE",
    CONTINUOUS_FULFILLMENT_DATE = "CONTINUOUS_FULFILLMENT_DATE",
    CONTINUOUS_INV_DATE = "CONTINUOUS_INV_DATE",
    CONTINUOUS_PAYMENT_DATE = "CONTINUOUS_PAYMENT_DATE",
}

export enum FulfillmentMode {
    SINGLE = "SINGLE",
    CONTINUOUS = "CONTINUOUS",
    MILESTONE = "MILESTONE",
    FRAMEWORK_AGREEMENT = "FRAMEWORK_AGREEMENT",
}

export enum FulfillmentRepeatType {
    FIX_DAY_PER_MONTH = "FIX_DAY_PER_MONTH",
    END_OF_THE_MONTH = "END_OF_THE_MONTH",
    FIX_DAY_QUARTERLY = "FIX_DAY_QUARTERLY",
    END_OF_THE_QUARTER = "END_OF_THE_QUARTER",
    PER_DAY = "PER_DAY",
}

export enum FulfillmentStatus {
    FREE = "FREE",
    FROZEN = "FROZEN",
}

export enum ConditionOperator {
    AND = "AND",
    OR = "OR",
}

export enum FilterOperator {
    equals = "equals",
    notEqual = "notEqual",
    contains = "contains",
    notContains = "notContains",
    startsWith = "startsWith",
    endsWith = "endsWith",
    lessThan = "lessThan",
    lessThanOrEqual = "lessThanOrEqual",
    greaterThan = "greaterThan",
    greaterThanOrEqual = "greaterThanOrEqual",
    inRange = "inRange",
    empty = "empty",
}

export enum FilterType {
    text = "text",
    number = "number",
    date = "date",
}

export enum SortDirection {
    asc = "asc",
    desc = "desc",
}

export enum GuaranteeUnit {
    PERCENTAGE = "PERCENTAGE",
    TOTAL = "TOTAL",
}

export enum InternalExternal {
    INTERNAL = "INTERNAL",
    EXTERNAL = "EXTERNAL",
}

export enum NotificationTypeEnum {
    CUSTOM_NOTIFICATION = "CUSTOM_NOTIFICATION",
    TASK_ACTIVATED = "TASK_ACTIVATED",
    TASK_WARNING = "TASK_WARNING",
    TASK_MISSED = "TASK_MISSED",
    TASK_DIGEST = "TASK_DIGEST",
}

export enum Role {
    ADMIN = "ADMIN",
    USER = "USER",
    GUARANTEE_NATURE_VIEW = "GUARANTEE_NATURE_VIEW",
    GUARANTEE_TYPE_VIEW = "GUARANTEE_TYPE_VIEW",
    DOCUMENT_TYPE_VIEW = "DOCUMENT_TYPE_VIEW",
    CONTACT_TYPE_VIEW = "CONTACT_TYPE_VIEW",
    COST_CENTER_VIEW = "COST_CENTER_VIEW",
    PENALTY_TYPE_VIEW = "PENALTY_TYPE_VIEW",
    PAYMENT_TYPE_VIEW = "PAYMENT_TYPE_VIEW",
    DELIVERABLE_PRODUCT_VIEW = "DELIVERABLE_PRODUCT_VIEW",
    REGISTER_NUMBER_TYPE_VIEW = "REGISTER_NUMBER_TYPE_VIEW",
    CURRENCY_VIEW = "CURRENCY_VIEW",
    TEMPLATE_TYPE_VIEW = "TEMPLATE_TYPE_VIEW",
    CONTRACT_LINK_TYPE_VIEW = "CONTRACT_LINK_TYPE_VIEW",
    CONTRACT_TYPE_VIEW = "CONTRACT_TYPE_VIEW",
    DOCUMENT_TEMPLATE_VIEW = "DOCUMENT_TEMPLATE_VIEW",
    CONTRACT_CLOSING_REASON_VIEW = "CONTRACT_CLOSING_REASON_VIEW",
    PARTNER_VIEW = "PARTNER_VIEW",
    PARTNER_EDIT = "PARTNER_EDIT",
    PARTNER_DELETE = "PARTNER_DELETE",
    CONTRACT_VIEW = "CONTRACT_VIEW",
    CONTRACT_EDIT = "CONTRACT_EDIT",
    CONTRACT_DELETE = "CONTRACT_DELETE",
    CONTRACT_FINANCIAL_DATA_VIEW = "CONTRACT_FINANCIAL_DATA_VIEW",
    CONTRACT_FINANCIAL_DATA_EDIT = "CONTRACT_FINANCIAL_DATA_EDIT",
    CONTRACT_DOCUMENTS_VIEW = "CONTRACT_DOCUMENTS_VIEW",
    CONTRACT_DOCUMENTS_EDIT = "CONTRACT_DOCUMENTS_EDIT",
    CONTRACT_CONNECTED_CONTRACTS_VIEW = "CONTRACT_CONNECTED_CONTRACTS_VIEW",
    CONTRACT_CONNECTED_CONTRACTS_EDIT = "CONTRACT_CONNECTED_CONTRACTS_EDIT",
    CONTRACT_CONTACT_VIEW = "CONTRACT_CONTACT_VIEW",
    CONTRACT_CONTACT_CONTRACTS_EDIT = "CONTRACT_CONTACT_CONTRACTS_EDIT",
    CONTRACT_NOTES_VIEW = "CONTRACT_NOTES_VIEW",
    CONTRACT_NOTES_CONTRACTS_EDIT = "CONTRACT_NOTES_CONTRACTS_EDIT",
    TASK_ALL_VIEW = "TASK_ALL_VIEW",
    PARTNER_CONTRACT_CONNECTION_QUERY = "PARTNER_CONTRACT_CONNECTION_QUERY",
}

export enum Scale {
    AMOUNT = "AMOUNT",
    PERCENTAGE = "PERCENTAGE",
}

export enum TaskPriority {
    LOW = "LOW",
    NORMAL = "NORMAL",
    HIGH = "HIGH",
}

export enum TaskStatus {
    PASSIVE = "PASSIVE",
    ACTIVE = "ACTIVE",
    CLOSED = "CLOSED",
}

export enum TaskTypeEnum {
    CONTRACT_DEADLINE = "CONTRACT_DEADLINE",
    CONTRACT_INVOICE = "CONTRACT_INVOICE",
    CONTRACT_PAYMENT_DEADLINE = "CONTRACT_PAYMENT_DEADLINE",
    MILESTONE_DEADLINE = "MILESTONE_DEADLINE",
    MILESTONE_INVOICE = "MILESTONE_INVOICE",
    MILESTONE_PAYMENT_DEADLINE = "MILESTONE_PAYMENT_DEADLINE",
    GUARANTEE_DEADLINE = "GUARANTEE_DEADLINE",
    CONTINUOUS_FULFILLMENT_INVOICE = "CONTINUOUS_FULFILLMENT_INVOICE",
    CONTINUOUS_FULFILLMENT_PAYMENT = "CONTINUOUS_FULFILLMENT_PAYMENT",
    CONTRACT_WARRANTY_DEADLINE = "CONTRACT_WARRANTY_DEADLINE",
    CUSTOM_CONTRACT_TASK = "CUSTOM_CONTRACT_TASK",
}
