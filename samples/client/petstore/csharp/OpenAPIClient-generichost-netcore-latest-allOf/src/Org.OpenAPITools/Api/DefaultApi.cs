// <auto-generated>
/*
 * Example
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using Microsoft.Extensions.Logging;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text.Json;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// This class is registered as transient.
    /// </summary>
    public interface IDefaultApi : IApi
    {
        /// <summary>
        /// The class containing the events
        /// </summary>
        DefaultApiEvents Events { get; }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="personId">The id of the person to retrieve</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task&lt;ApiResponse&lt;Person&gt;&gt;</returns>
        Task<ApiResponse<Person>> ListAsync(string personId, System.Threading.CancellationToken cancellationToken = default);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="personId">The id of the person to retrieve</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task&lt;ApiResponse&gt;Person&gt;?&gt;</returns>
        Task<ApiResponse<Person>?> ListOrDefaultAsync(string personId, System.Threading.CancellationToken cancellationToken = default);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// This class is registered as transient.
    /// </summary>
    public class DefaultApiEvents
    {
        /// <summary>
        /// The event raised after the server response
        /// </summary>
        public event EventHandler<ApiResponseEventArgs<Person>>? OnList;

        /// <summary>
        /// The event raised after an error querying the server
        /// </summary>
        public event EventHandler<ExceptionEventArgs>? OnErrorList;

        internal void ExecuteOnList(ApiResponse<Person> apiResponse)
        {
            OnList?.Invoke(this, new ApiResponseEventArgs<Person>(apiResponse));
        }

        internal void ExecuteOnErrorList(Exception exception)
        {
            OnErrorList?.Invoke(this, new ExceptionEventArgs(exception));
        }
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public sealed partial class DefaultApi : IDefaultApi
    {
        private JsonSerializerOptions _jsonSerializerOptions;

        /// <summary>
        /// The logger
        /// </summary>
        public ILogger<DefaultApi> Logger { get; }

        /// <summary>
        /// The HttpClient
        /// </summary>
        public HttpClient HttpClient { get; }

        /// <summary>
        /// The class containing the events
        /// </summary>
        public DefaultApiEvents Events { get; }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi(ILogger<DefaultApi> logger, HttpClient httpClient, JsonSerializerOptionsProvider jsonSerializerOptionsProvider, DefaultApiEvents defaultApiEvents)
        {
            _jsonSerializerOptions = jsonSerializerOptionsProvider.Options;
            Logger = logger;
            HttpClient = httpClient;
            Events = defaultApiEvents;
        }

        partial void FormatList(ref string personId);

        /// <summary>
        /// Validates the request parameters
        /// </summary>
        /// <param name="personId"></param>
        /// <returns></returns>
        private void ValidateList(string personId)
        {
            if (personId == null)
                throw new ArgumentNullException(nameof(personId));
        }

        /// <summary>
        /// Processes the server response
        /// </summary>
        /// <param name="apiResponseLocalVar"></param>
        /// <param name="personId"></param>
        private void AfterListDefaultImplementation(ApiResponse<Person> apiResponseLocalVar, string personId)
        {
            bool suppressDefaultLog = false;
            AfterList(ref suppressDefaultLog, apiResponseLocalVar, personId);
            if (!suppressDefaultLog)
                Logger.LogInformation("{0,-9} | {1} | {3}", (apiResponseLocalVar.DownloadedAt - apiResponseLocalVar.RequestedAt).TotalSeconds, apiResponseLocalVar.StatusCode, apiResponseLocalVar.Path);
        }

        /// <summary>
        /// Processes the server response
        /// </summary>
        /// <param name="suppressDefaultLog"></param>
        /// <param name="apiResponseLocalVar"></param>
        /// <param name="personId"></param>
        partial void AfterList(ref bool suppressDefaultLog, ApiResponse<Person> apiResponseLocalVar, string personId);

        /// <summary>
        /// Logs exceptions that occur while retrieving the server response
        /// </summary>
        /// <param name="exception"></param>
        /// <param name="pathFormat"></param>
        /// <param name="path"></param>
        /// <param name="personId"></param>
        private void OnErrorListDefaultImplementation(Exception exception, string pathFormat, string path, string personId)
        {
            bool suppressDefaultLog = false;
            OnErrorList(ref suppressDefaultLog, exception, pathFormat, path, personId);
            if (!suppressDefaultLog)
                Logger.LogError(exception, "An error occurred while sending the request to the server.");
        }

        /// <summary>
        /// A partial method that gives developers a way to provide customized exception handling
        /// </summary>
        /// <param name="suppressDefaultLog"></param>
        /// <param name="exception"></param>
        /// <param name="pathFormat"></param>
        /// <param name="path"></param>
        /// <param name="personId"></param>
        partial void OnErrorList(ref bool suppressDefaultLog, Exception exception, string pathFormat, string path, string personId);

        /// <summary>
        ///  
        /// </summary>
        /// <param name="personId">The id of the person to retrieve</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="ApiResponse{T}"/>&gt; where T : <see cref="Person"/></returns>
        public async Task<ApiResponse<Person>?> ListOrDefaultAsync(string personId, System.Threading.CancellationToken cancellationToken = default)
        {
            try
            {
                return await ListAsync(personId, cancellationToken).ConfigureAwait(false);
            }
            catch (Exception)
            {
                return null;
            }
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="personId">The id of the person to retrieve</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="ApiResponse{T}"/>&gt; where T : <see cref="Person"/></returns>
        public async Task<ApiResponse<Person>> ListAsync(string personId, System.Threading.CancellationToken cancellationToken = default)
        {
            UriBuilder uriBuilderLocalVar = new UriBuilder();

            try
            {
                ValidateList(personId);

                FormatList(ref personId);

                using (HttpRequestMessage httpRequestMessageLocalVar = new HttpRequestMessage())
                {
                    uriBuilderLocalVar.Host = HttpClient.BaseAddress!.Host;
                    uriBuilderLocalVar.Port = HttpClient.BaseAddress.Port;
                    uriBuilderLocalVar.Scheme = HttpClient.BaseAddress.Scheme;
                    uriBuilderLocalVar.Path = ClientUtils.CONTEXT_PATH + "/person/display/{personId}";
                    uriBuilderLocalVar.Path = uriBuilderLocalVar.Path.Replace("%7BpersonId%7D", Uri.EscapeDataString(personId.ToString()));

                    httpRequestMessageLocalVar.RequestUri = uriBuilderLocalVar.Uri;

                    string[] acceptLocalVars = new string[] {
                        "application/json"
                    };

                    string? acceptLocalVar = ClientUtils.SelectHeaderAccept(acceptLocalVars);

                    if (acceptLocalVar != null)
                        httpRequestMessageLocalVar.Headers.Accept.Add(new MediaTypeWithQualityHeaderValue(acceptLocalVar));

                    httpRequestMessageLocalVar.Method = HttpMethod.Get;

                    DateTime requestedAtLocalVar = DateTime.UtcNow;

                    using (HttpResponseMessage httpResponseMessageLocalVar = await HttpClient.SendAsync(httpRequestMessageLocalVar, cancellationToken).ConfigureAwait(false))
                    {
                        string responseContentLocalVar = await httpResponseMessageLocalVar.Content.ReadAsStringAsync(cancellationToken).ConfigureAwait(false);

                        ApiResponse<Person> apiResponseLocalVar = new ApiResponse<Person>(httpRequestMessageLocalVar, httpResponseMessageLocalVar, responseContentLocalVar, "/person/display/{personId}", requestedAtLocalVar, _jsonSerializerOptions);

                        AfterListDefaultImplementation(apiResponseLocalVar, personId);

                        Events.ExecuteOnList(apiResponseLocalVar);

                        return apiResponseLocalVar;
                    }
                }
            }
            catch(Exception e)
            {
                OnErrorListDefaultImplementation(e, "/person/display/{personId}", uriBuilderLocalVar.Path, personId);
                Events.ExecuteOnErrorList(e);
                throw;
            }
        }
    }
}
