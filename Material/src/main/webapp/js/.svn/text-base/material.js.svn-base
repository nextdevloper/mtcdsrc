/*******************************************************************************
 * マテリアルコックピット共通JavaScript.
 * 作成日：
 * 作成者：
 * 前提条件：jquery.js を機能を利用しているためJavaScriptを
 *           読み込ませておくこと
 *******************************************************************************/
//>> 変数定義領域 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
/** ダブルポストチェック */
var doublePostChecker = {
    /** ダブルポストチェックフラグ */
    postFlg : false,
    /**
     * 初期化処理
     */
    init : function() {
        postFlg = false;
    },
    /**
     * ダブルポストチェック
     * リクエスト送信中の場合には True ,そうでない場合には False を返す.
     */
    isSending : function(){
        if(postFlg == true){
            return true;
        }
        return false;
    },
    /**
     * リクエスト送信開始
     */
    start : function(){
        postFlg = true;
    },
    /**
     * リクエスト送信終了
     */
    end : function(){
        postFlg = false;
    }
};

//>> 関数定義領域 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
/**
 * 画面表示初期処理.
 * bodyタグのonLoadイベントで実行する.
 * 1.初期化
 * 1.1 ダブルポストチェックフラグ初期化
 */
function init() {
    //1.初期化
    //1.1 ダブルポストチェックフラグ初期化
    //alert('1.1 ダブルポストチェックフラグ初期化');
    doublePostChecker.init();
}

/**
 * リクエスト送信.
 * Formサブミットによるリクエスト送信を行う.
 * 1.チェック
 * 1.1 Form が存在しない場合には、リクエストは送信しない
 * 1.2 リクエスト送信中の場合には、リクエストは送信しない
 * 2.リクエスト送信
 * 2.1 ダブルポストチェック開始
 * 2.2 リクエスト送信
 */
function send(formId) {
    var form = document.getElementById(formId);
    
    // 1. チェック
    if(isEmpty(form)){
        // 1.1 Form が存在しない場合には、リクエストは送信しない
        return false;
    }
    if(doublePostChecker.isSending()){
        // 1.2 リクエスト送信中の場合には、リクエストは送信しない
        alert('1.2 リクエスト送信中の場合には、リクエストは送信しない');
        return false;
    }
    // 2.リクエスト送信
    // 2.1 ダブルポストチェック開始
    doublePostChecker.start();
    // 2.2 リクエスト送信
    form.submit();
}

/**
 * 非同期リクエスト送信.
 * jQueryを利用したリクエスト送信を行う.
 * 入力、未入力に関わらずFormに存在する全て入力項目を送信する.
 * 出力は引数idに指定されたオブジェクトを置き換える.
 * 1. チェック
 * 1.1 Form が存在しない場合には、リクエストは送信しない
 * 1.2 Id が存在しない場合には、リクエストは送信しない
 * 1.3 リクエスト送信中の場合には、リクエストは送信しない
 * 2. リクエスト組立
 * 2.1 Form に存在するINPUTをリクエストに設定
 * 2.2 Form に存在するTEXTAREAをリクエストに設定
 * 3. リクエスト送信
 * 3.1 ダブルポストチェック開始
 * 3.2 リクエスト送信
 * 3.3 ダブルポストチェック終了
 * @param id レスポンスを表示するタグのid属性
 * @param urt ターゲットURL
 * @param formId リクエストするフォームのid属性
 */
function sendAjax(id,url,formId){
    var form = document.getElementById(formId);
    var outTarget = document.getElementById(id);
    var inputElems = form.getElementsByTagName('input');
    var textareaElems = form.getElementsByTagName('textarea');
    var params={};
    //alert('リクエスト送信 開始');
    // 1. チェック
    if(isEmpty(form)){
        // 1.1 Form が存在しない場合には、リクエストは送信しない
    	alert('1.1 Form が存在しない場合には、リクエストは送信しない');
        return false;
    }
    if(isEmpty(outTarget)){
        // 1.2 Id が存在しない場合には、リクエストは送信しない
    	alert('1.2 Id が存在しない場合には、リクエストは送信しない');
        return false;
    }
    if(doublePostChecker.isSending()){
        // 1.3 リクエスト送信中の場合には、リクエストは送信しない
        alert('1.3 リクエスト送信中の場合には、リクエストは送信しない');
        return false;
    }
    
    // 2. リクエスト組立
    // 2.1 Form に存在するINPUTをリクエストに設定
    copyParams(inputElems, params);
    
    // 2.2 Form に存在するTEXTAREAをリクエストに設定
    copyParams(textareaElems, params);
    
    // 3. リクエスト送信
    // 3.1 ダブルポストチェック開始
    doublePostChecker.start();
    
    // 3.2 リクエスト送信
    // 3.3 コールバックによりダブルポストチェック終了
    ////$('#message').load('${f:url('result')}', params);
    //alert('リクエスト送信');
    $('#'+id).load(url, params, function(){doublePostChecker.end();});
}
/**
 * リクエスト組立.
 * @param from フォームのエレメント
 * @param to コピー先オブジェクト
 */
function copyParams(from, to) {
    // nodeList 型オブジェクト elems から 1 つずつ要素 (element 型オブジェクト) を取り出す 
    for( var i = 0; i < from.length; i++ ) {
        // nodeList 型オブジェクトは配列のように扱うことができる
        var elem = from[i];
        // 下のように item メソッド を使用しても良い
        // elem = elems.item(i);
        //alert('elem('+i+') name = ' + elem.name +'\nelem.value = ' + elem.value);
        
        // ★クライアントの入力チェックは別途検討。Seasar2のデフォルト機能であるかもしれない。
        // ★複数選択可能な項目を考慮すること、チェックボックスなど。項目が分かれていいれば問題なし。
        
        //to["name"]=$("#name").val();
        to[elem.name]=elem.value;
        //alert('params ' + elem.name + ' = ' + to[elem.name]);
    }
}

//>> 関数定義領域 (共通) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
/**
 * 項目が未設定であるか判定する。
 * 未設定=True,設定=False
 * @obj オブジェクト
 */
function isEmpty(obj){
    if(obj == null){
        return true;
    }
    return false;
}
