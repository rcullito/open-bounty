(ns commiteth.eth.mallorca
  (:require [clojure.data.json :as json]
            [org.httpkit.client :refer [post]]
            [clojure.java.io :as io]
            [commiteth.config :refer [env]]
            [clojure.string :refer [join]]
            [clojure.tools.logging :as log]
            [clojure.string :as str]
            [pandect.core :as pandect]
            [commiteth.util.util :refer [json-api-request]])
  (:import [org.web3j
            protocol.Web3j
            protocol.http.HttpService
            protocol.core.DefaultBlockParameterName
            protocol.core.methods.response.EthGetTransactionCount
            protocol.core.methods.request.RawTransaction
            utils.Numeric
            crypto.Credentials
            crypto.TransactionEncoder
            crypto.WalletUtils]))

(defn isle-of-mallorca []
  "this is purely a test namespace for sbmitting a PR"
  {:about "I don't do anything!"})
